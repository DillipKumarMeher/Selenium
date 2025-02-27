package a08_actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveByOffset {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://yonobusiness.sbi/login/yonobusinesslogin");

        driver.findElement(By.id("password")).sendKeys("kiya bolti public");
        Actions ref = new Actions(driver);
        // ref.moveByOffset(1212, 301).clickAndHold().perform();
        ref.moveToLocation(121, 301).clickAndHold().perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
