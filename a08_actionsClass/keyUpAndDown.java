package a08_actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class keyUpAndDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.flipkart.com/");

        // keyUp and keyDown
        Actions ref = new Actions(driver);
        ref.moveToElement(driver.findElement(By.name("q"))).click().keyDown(Keys.SHIFT).sendKeys("iphone" + Keys.ENTER)
                .keyUp(Keys.SHIFT).build().perform();

        Thread.sleep(2000);
        // arrow up/down and page up/down
        for (int i = 0; i <= 10; i++) {
            ref.sendKeys(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(1000);
        }
        ref.sendKeys(Keys.PAGE_UP).build().perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
