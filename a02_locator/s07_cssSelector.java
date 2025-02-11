package a02_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s07_cssSelector {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");

        driver.findElement(By.id("small-searchterms")).sendKeys("bookk");
        driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
