package a06_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelectDrodown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://demoapp.skillrary.com/");

        // select dropdown
        WebElement listBox = driver.findElement(By.id("cars"));
        Select multiSelect = new Select(listBox);

        // single select or multi select..?
        System.out.println(multiSelect.isMultiple());

        multiSelect.selectByValue("99");
        multiSelect.selectByValue("199");
        Thread.sleep(2000);

        // de-select dropdown
        multiSelect.deselectByValue("99");
        multiSelect.deselectByValue("199");

        // multiSelect.deselectAll();
        Thread.sleep(2000);
        driver.quit();
    }
}