package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1_click {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demowebshop.tricentis.com/");

        //click
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}