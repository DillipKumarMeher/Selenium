package a09_popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileUploadPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\Dell\\Downloads\\IT.pdf");
	}
}
