package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class s3_getCurrentUrl {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        String currentUrlOfWebPage = driver.getCurrentUrl();
        System.out.println(currentUrlOfWebPage);
    }
}