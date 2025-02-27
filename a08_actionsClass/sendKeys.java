package a08_actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com");

        // sendKeys() method is used to enter text in a text box
        driver.findElement(By.id("email")).sendKeys("10200304050");
        driver.findElement(By.id("email")).sendKeys("anythink123");

        Thread.sleep(3000);
        driver.quit();
    }
}
