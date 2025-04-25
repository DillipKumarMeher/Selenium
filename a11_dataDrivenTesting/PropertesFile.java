package a11_dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertesFile {
	public static void main(String[] args) throws IOException, InterruptedException {

		FileInputStream file = new FileInputStream("./testData/fb.properties");
		Properties prop = new Properties();
		prop.load(file);

		String url = prop.getProperty("acceptedUrl");
		String un = prop.getProperty("accepteduserName");
		String pass = prop.getProperty("acceptedpassword");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.navigate().to(url);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pass);
		//driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
