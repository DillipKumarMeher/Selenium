package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s14_isEnabled {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        
        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(1000);

        //isEnabled_And_isDisplayed
        WebElement logInButtonE = driver.findElement(By.xpath("//Button[@type='submit']"));
        System.out.println(logInButtonE.isEnabled());
        System.out.println(logInButtonE.isDisplayed());
        Thread.sleep(1000);

        System.err.println("After puting the value\n-----------------");

        //isEnabled_And_isDisplayed
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ASDFGH");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("as12457");
        WebElement logInButton = driver.findElement(By.xpath("//Button[@type='submit']"));
        System.out.println(logInButton.isEnabled());
        System.out.println(logInButton.isDisplayed());

        Thread.sleep(2000);
        driver.quit();
    }
}
