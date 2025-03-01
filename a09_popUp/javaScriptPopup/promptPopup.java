package a09_popUp.javaScriptPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		WebElement irm = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(irm);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert ref = driver.switchTo().alert();
		ref.sendKeys("Dillip");
		ref.accept();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
