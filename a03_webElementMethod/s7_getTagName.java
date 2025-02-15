package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s7_getTagName {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.actitime.com/");
        
        //getTagName
        String tagName = driver.findElement(By.linkText("Try actiTIME for Free")).getTagName();
        System.out.println(tagName);
        driver.quit();
    }
}
