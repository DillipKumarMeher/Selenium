package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s8_getCssValue {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.actitime.com/");

        WebElement c = driver.findElement(By.linkText("Try actiTIME for Free"));
        System.out.println(c.getCssValue("border-radius"));
        System.out.println(c.getCssValue("line-height"));
        driver.quit();
    }
}
