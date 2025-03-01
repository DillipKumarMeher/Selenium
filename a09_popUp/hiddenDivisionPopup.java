package a09_popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenDivisionPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.navigate().to("https://www.makemytrip.com/");

		driver.findElement(By.xpath("//span[@class=\"commonModal__close\"]")).click();
		driver.findElement(By.xpath("//span[.='Departure']")).click();

		for (;;) {
			try {
				driver.findElement(By.xpath("//div[@aria-label=\"Fri May 02 2025\"]")).click();
				break;

			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}
