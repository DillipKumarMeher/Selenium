package a10_javaScriptExecutor.windowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.worldometers.info/geography/flags-of-the-world/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement indianFlag = driver.findElement(By.xpath("//img[@src='/img/flags/small/tn_in-flag.gif']"));
		js.executeScript("arguments[0].scrollIntoView(true)",indianFlag);
	}
}
