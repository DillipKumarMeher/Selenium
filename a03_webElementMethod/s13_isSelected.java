package a03_webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class s13_isSelected {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demowebshop.tricentis.com/");
        Thread.sleep(1000);

        // isSelected
        WebElement el = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        System.out.println(el.isSelected());
        Thread.sleep(1000);

        System.out.println("----\nafter selecting\n------");
        el.click();
        System.out.println(el.isSelected());

        Thread.sleep(1000);
        driver.quit();
    }
}
