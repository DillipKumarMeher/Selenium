package a00_practics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesXpath {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds());

        driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        // parent
        driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[1]/parent::div"));

        // child
        driver.findElement(By.xpath("//div[@class='container']/child::label[1]/following-sibling::input[1]"));

        // following-sibling
        driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[1]")).sendKeys("Dillip");

        // preceding-sibling
        driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding::td/child::input"));

        // ancestor
        driver.findElement(By.xpath("//button[@class='btn']/ancestor::div"));

        // descendant
        driver.findElement(By.xpath("//div[@class='container']/descendant::button[text()='Register']"));

    }
}
