package a10_javaScriptExecutor.windowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/search?sca_esv=4506315641ad45d1&q=flower+image&udm=2&fb"
				+ "s=ABzOT_CWdhQLP1FcmU5B0fn3xuWpA-dk4wpBWOGsoR7DG5zJBpwxALD7bRaeOIZxqOFEngxArVnzSUyc1QpiuTUVHc4E7mfS7phR3Xv"
				+ "7xK7LS9NQY_j97lM4M75d2ahQ4ow7H_MMDBeIa-r7PHqrio0d-7tMQ_E0RZpVjxCnuD1kZRCOLkWlDe5a0F"
				+ "r-fKQkiMl_h4azCv540b92_VHR5v1Qli92u5Tw4Q&sa=X&ved=2ahUKEwjnwrb6pO2LAxWwyTgGHZAUIiAQtKgLegQIEBAB&biw=1366&bih=589&dpr=1");

		WebElement search = driver.findElement(By.id("APjFqb"));
		search.clear();
		search.sendKeys("flower image");
		search.sendKeys(Keys.ENTER);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (;;) {
			try {
				driver.findElement(By.xpath("//img[@id='dimg_fgXHZ_b_NaPC4-EPoO_8aA_303']")).click();
				break;
			} catch (Exception e) {
				js.executeScript("window.scrollBy(0,200)");
			}
		}
	}
}
