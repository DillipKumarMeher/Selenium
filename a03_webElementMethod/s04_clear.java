package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s4_clear {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demo.vtiger.com/vtigercrm/");
        Thread.sleep(2000);

        //clear
        WebElement userName = driver.findElement(By.id("username"));
        userName.clear();
        Thread.sleep(1000);
        userName.sendKeys("Dilllll");

        //clear
        WebElement pass = driver.findElement(By.id("password"));
        pass.clear();
        Thread.sleep(1000);
        pass.sendKeys("Dill1234");

        Thread.sleep(2000);
        driver.quit();
    } 
}
