package a05_syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.navigate().to("https://www.shoppersstack.com/products_page/16");
        driver.findElement(By.id("Check Delivery")).sendKeys("100000");

        WebDriverWait ref = new WebDriverWait(driver, Duration.ofSeconds(15));
        ref.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
        driver.findElement(By.id("Check")).click();
        // ExplicitWait

    }
}
