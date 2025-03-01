package a09_popUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");

		driver.findElement(By.id("newTabBtn")).click();

		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for (String curentWindow : childWindow) {
			if (!curentWindow.equals(parentWindow)) {
				driver.switchTo().window(curentWindow);

				driver.findElement(By.id("alertBox")).click();
				Alert ref = driver.switchTo().alert();
				ref.accept();
				Thread.sleep(2000);
			}
		}

		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("name")).sendKeys("1020102010");
	}
}
