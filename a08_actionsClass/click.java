package a08_actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("10200304050");
        driver.findElement(By.id("pass")).sendKeys("anythink123");

        // click() method is used to click on any element
        driver.findElement(By.name("login")).click();
        
        Thread.sleep(2000);
        driver.quit();
    }
}
