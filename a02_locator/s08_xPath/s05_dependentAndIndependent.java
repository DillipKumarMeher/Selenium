package a02_locator.s08_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s05_dependentAndIndependent {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Thread.sleep(2000);

        driver.findElement(By.partialLinkText("Books")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//input[@type='button']")).click();
        Thread.sleep(3000);
        driver.quit();
    }

}