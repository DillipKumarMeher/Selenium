package a02_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s02_name {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.instagram.com/");

        driver.findElement(By.name("username")).sendKeys("9937332194");
        Thread.sleep(1000);

        driver.findElement(By.name("password")).sendKeys("Chhua@897");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //driver.quit();
    }
}
