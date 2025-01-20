package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class s08_ToUseClose {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        //close
        driver.close();
    }
}
