package a02_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s03_className {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");

        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.className("email")).sendKeys("dinga08@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.className("password")).sendKeys("Dinga123");
        Thread.sleep(2000);

        driver.findElement(By.id("RememberMe")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
