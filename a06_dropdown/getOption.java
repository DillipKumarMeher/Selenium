package a06_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getOption {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://z-upload.facebook.com/reg/");

        WebElement dayDrop = driver.findElement(By.id("day"));
        Select daySelect = new Select(dayDrop);
        // daySelect.selectByVisibleText("2");

        // getOptions() method is used to get all options from the dropdown.
        List<WebElement> allSelect = daySelect.getOptions();
        for (WebElement x : allSelect) {
            System.out.println(x.getText());
            daySelect.selectByVisibleText(x.getText());
        }

        Thread.sleep(2000);
        driver.quit();
    }
}
