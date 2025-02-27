package a08_actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class release {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://yonobusiness.sbi/login/yonobusinesslogin");

        driver.findElement(By.id("password")).sendKeys("KIyaBoltiPublic");
        WebElement icone = driver.findElement(By.xpath("//div[@class=\"showPassword shownhide\"]"));
        Actions ref = new Actions(driver);
        ref.clickAndHold(icone).perform();
        Thread.sleep(4000);
        
        ref.release(icone).perform();
        Thread.sleep(2000);
        driver.quit();
    }
}