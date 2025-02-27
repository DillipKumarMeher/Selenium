package a08_actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveToElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.flipkart.com/");

        Actions ref = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
        ref.moveToElement(element).perform();
        Thread.sleep(1000);
        WebElement element2 = driver.findElement(By.linkText("Men Footwear"));
        ref.moveToElement(element2).perform();
        Thread.sleep(1000);
        WebElement element3 = driver.findElement(By.linkText("Shoe Care"));
        ref.moveToElement(element3).click().perform();
        
        Thread.sleep(3000);
        driver.quit();
    }
}
