package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s12_isDisplayed {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(1000);

        //isDisplayed_And_isEnabled
        WebElement logInButtonE = driver.findElement(By.xpath("//Button[@type='submit']"));
        System.out.println(logInButtonE.isDisplayed());
        System.out.println(logInButtonE.isEnabled());
        Thread.sleep(1000);

        System.err.println("After puting the value\n-----------------");

        //isDisplayed_And_isEnabled
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ASDFGH");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("as12457");
        WebElement logInButton = driver.findElement(By.xpath("//Button[@type='submit']"));
        System.out.println(logInButton.isDisplayed());
        System.out.println(logInButton.isEnabled());

        Thread.sleep(2000);
        driver.quit();
    }
}
