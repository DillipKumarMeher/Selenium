package a02_locator.s08_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s06_axes {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/login.php/");

        driver.findElement(By.id("email")).sendKeys("102010203");

        driver.findElement(By.id("pass")).sendKeys("DillipBoss");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='pass']/following-sibling::div")).click();
    }
}