package a00_practics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUp {

 
    public static void main(String[] args) {
        ChromeOptions setting = new ChromeOptions();
        setting.addArguments("--disable-notifications");
        
        WebDriver driver = new ChromeDriver(setting);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.yatra.com/");
    }
}
