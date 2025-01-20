package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class s4_getPageSource {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://www.youtube.com/");

        String pageSourceOfWebPage = driver.getPageSource();
        System.out.println(pageSourceOfWebPage);
    }
}
