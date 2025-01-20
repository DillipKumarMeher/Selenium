package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class s2_getTitle {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        String titleOfWebPage = driver.getTitle();
        System.out.println(titleOfWebPage);
    }
}