package a01_webDriverMethod;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s6_getWindowHandles {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//Button[@type='submit']")).click();
        Set<String> parentId = driver.getWindowHandles();
        System.out.println(parentId);
        
    }
}