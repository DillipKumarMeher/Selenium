package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class s1_get {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");
      }
}