package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class s11_getRect {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.instagram.com/");
        Thread.sleep(2000);

        Rectangle rec = driver.findElement(By.xpath("//Button[@type='submit']")).getRect();
        System.out.println(rec);
        System.out.println(rec.getHeight());
        System.out.println(rec.getWidth());
        System.out.println(rec.getX());
        System.out.println(rec.getY());
        driver.quit();
    }
}
