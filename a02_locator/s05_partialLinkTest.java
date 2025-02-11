package a02_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s05_partialLinkTest {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/login");

        driver.findElement(By.partialLinkText("Books")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}