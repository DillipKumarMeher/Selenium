package a10_javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformDisableElement {
    public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.oracle.com/in/java/technologies/downloads/");
		
		driver.findElement(By.linkText("JDK 21")).click();
		WebElement disableElement = driver.findElement(By.linkText("https://download.oracle.com/java/21/latest/jdk-21_linux-aarch64_bin.tar.gz"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", disableElement);
	}
}
