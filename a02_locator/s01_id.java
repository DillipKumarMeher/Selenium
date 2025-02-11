package a02_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s01_id {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("9937332194");
        Thread.sleep(1000);

        driver.findElement(By.id("pass")).sendKeys("Chhua@897");
        Thread.sleep(1000);

        driver.findElement(By.name("login")).click();
        // driver.quit();
    }
}