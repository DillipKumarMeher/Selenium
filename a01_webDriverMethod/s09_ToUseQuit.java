package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class s09_ToUseQuit {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        //quit
        driver.quit();
    }
}
