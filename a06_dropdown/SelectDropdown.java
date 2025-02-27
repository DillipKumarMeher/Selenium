package a06_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://z-upload.facebook.com/reg/");

        // select dropdown
        WebElement dayDrop = driver.findElement(By.id("day"));
        Select daySelect = new Select(dayDrop);
        daySelect.selectByVisibleText("2");

        Thread.sleep(2000);
        driver.quit();
    }
}
