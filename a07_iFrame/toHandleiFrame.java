package a07_iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toHandleiFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.dream11.com/");

        // switch to iFrame using int index
        // driver.switchTo().frame(0);

        // switch to iFrame using name or id
        // driver.switchTo().frame("send-sms-iframe");

        // switch to iFrame using WebElement
        WebElement iFrame = driver.findElement(By.id("send-sms-iframe"));
        driver.switchTo().frame(iFrame);
        driver.findElement(By.id("regEmail")).sendKeys("12101012450");
        Thread.sleep(2000);

        // switch back to main page
        // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
