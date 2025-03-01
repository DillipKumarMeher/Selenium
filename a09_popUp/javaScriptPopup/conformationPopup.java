package a09_popUp.javaScriptPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class conformationPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://licindia.in/");

		driver.findElement(By.xpath("//button[text()='Close']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@title='Login']")).click();
		Alert ref = driver.switchTo().alert();
		ref.accept();

		Thread.sleep(2000);
		driver.quit();
	}
}
