package a08_actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://demoapp.skillrary.com/product.php?product=selenium-training");

        WebElement addButton = driver.findElement(By.id("add"));
        Actions ref = new Actions(driver);
        ref.doubleClick(addButton).perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
