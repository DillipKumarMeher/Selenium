package a02_locator.s08_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s02_visibleText {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}