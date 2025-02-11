package a02_locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s06_tagName {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.in/");

        List<WebElement> image = driver.findElements(By.tagName("img"));
        System.out.println(image.size());
        Thread.sleep(3000);
        driver.quit();
    }
}