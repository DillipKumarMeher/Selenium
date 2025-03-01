package a09_popUp.javaScriptPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
		Alert ref = driver.switchTo().alert();
		ref.accept();	
//		ref.dismiss();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
