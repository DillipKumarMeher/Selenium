package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s2_sumbit {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.linkText("Log in")).click();

        driver.findElement(By.id("email")).sendKeys("dinga08@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("Dinga123");
        Thread.sleep(1000);

        //sumbit
        driver.findElement(By.xpath("//button[@type='submit']")).submit();
        Thread.sleep(3000);
        driver.quit();
    }
}
