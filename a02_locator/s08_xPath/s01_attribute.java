package a02_locator.s08_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s01_attribute {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");

        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
