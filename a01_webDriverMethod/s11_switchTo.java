package a01_webDriverMethod;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s11_switchTo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.dream11.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		for (;;) {
			try {
				driver.findElement(By.linkText("About Us")).click();
				break;
			} catch (Exception e) {
				js.executeScript("Window.scrollBy(0,300)");
			}
		}

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String p1 = it.next();
		String p2 = it.next();

		driver.switchTo().window(p2);

		driver.findElement(By.xpath("//li[@id='menu-item-4018']")).click();

	}
}
