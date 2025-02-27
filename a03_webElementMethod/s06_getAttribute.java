package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s6_getAttribute {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.actitime.com/");

        //getAttribute
        String value = driver.findElement(By.linkText("Try actiTIME for Free")).getAttribute("class");
        System.out.println(value);
        driver.quit();   
    }
}
