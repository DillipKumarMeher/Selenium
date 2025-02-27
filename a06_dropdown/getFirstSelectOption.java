package a06_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectOption {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://demoapp.skillrary.com/");
        WebElement drop = driver.findElement(By.id("cars"));
        Select ref = new Select(drop);
        ref.selectByVisibleText("INR 50 - INR 99 ( 1 ) ");
        ref.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");

        // getFirstSelectedOption() method is used to get the first selected option from
        // the dropdown.
        WebElement firstSelectedOption = ref.getFirstSelectedOption();
        System.out.println(firstSelectedOption.getText());

        Thread.sleep(2000);
        driver.quit();
    }
}
