package a04_takeScreenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class toTakesScreenshotOfElement {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://clients.njoyn.com/CORP/xweb/xweb.asp?CLID=21001&page=SessionExpired&lang=1");

        File temp = driver.findElement(By.xpath("//div[@class=\"hero-banner-image device-\"]"))
                .getScreenshotAs(OutputType.FILE);
        File scr = new File("C:\\\\Users\\\\Dell\\\\VisualStudioCode\\\\Selenium\\\\screenshots\\\\p2.png");
        FileHandler.copy(temp, scr);
    }
}