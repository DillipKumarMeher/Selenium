package a01_webDriverMethod;

import org.openqa.selenium.chrome.ChromeDriver;

public class s5_getWindowHandle {
    public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    
    driver.get("https://www.youtube.com/");

    String parentId = driver.getWindowHandle();
    System.out.println(parentId);
 }
}