package a01_webDriverMethod;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class s10_navigateMethod {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com/");

        Navigation nav = driver.navigate();
        nav.back();
        Thread.sleep(2000);
        nav.forward();
        Thread.sleep(2000);
        nav.refresh();

        driver.quit();
    }
}