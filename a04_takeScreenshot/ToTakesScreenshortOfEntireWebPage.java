package a04_takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToTakesScreenshortOfEntireWebPage {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.oyorooms.com/");
        Thread.sleep(2000);

        TakesScreenshot ref = (TakesScreenshot) driver;
        File temp = ref.getScreenshotAs(OutputType.FILE);
        File foo = new File("C:\\Users\\Dell\\VisualStudioCode\\Selenium\\screenshots\\p1.png");
        FileHandler.copy(temp, foo);

        Thread.sleep(4000);
        driver.quit();
    }
}