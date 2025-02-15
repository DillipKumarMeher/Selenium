package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s5_getTest {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demowebshop.tricentis.com/");
        driver.findElement(By.linkText("Log in")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@value='Log in']")).click();
        Thread.sleep(1000);

        //getText
        WebElement text = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        System.out.println(text.getText());
        driver.quit(); 
    }
}