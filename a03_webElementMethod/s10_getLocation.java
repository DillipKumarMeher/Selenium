package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class s10_getLocation {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(2000);

        Point loc = driver.findElement(By.xpath("//Button[@type='submit']")).getLocation();
        System.out.println(loc);
        System.out.println(loc.getY());
        System.out.println(loc.getY());
        driver.quit();
    }
}
