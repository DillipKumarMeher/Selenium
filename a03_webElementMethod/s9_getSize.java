package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class s9_getSize {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(2000);

        Dimension getSize = driver.findElement(By.xpath("//Button[@type='submit']")).getSize();
        System.out.println(getSize);
        Thread.sleep(2000);
        driver.quit();
    }
}
