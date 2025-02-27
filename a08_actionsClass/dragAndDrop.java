package a08_actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
        driver.switchTo().frame(iframe);

        WebElement img1 = driver.findElement(By.xpath("//h5[text()='High Tatras']/parent::li"));
        WebElement trash = driver.findElement(By.id("trash"));

        // dragAndDrop() method is used to drag and drop the element.
        Actions ref = new Actions(driver);
        ref.dragAndDrop(img1, trash).perform();
        Thread.sleep(2000);

        // Switch back to the main page.
        WebElement imgBox = driver.findElement(By.id("gallery"));
        ref.dragAndDrop(img1, imgBox).perform();

        Thread.sleep(2000);
        driver.quit();

    }
}
