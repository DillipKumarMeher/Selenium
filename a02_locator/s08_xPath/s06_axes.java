package a02_locator.s08_xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class s06_axes {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.facebook.com/login.php/");

        driver.findElement(By.id("email")).sendKeys("102010203");

        driver.findElement(By.id("pass")).sendKeys("DillipBoss");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='pass']/following::div[2]")).click();
    }
}

        //  driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        
        // //parent
        // driver.findElement(By.xpath("//label[text()='Last Name']/following-sibling::input[1]/parent::div"));
        
        // //child
        // driver.findElement(By.xpath("//div[@class='container']/child::label[1]/following-sibling::input[1]"));

        // // following-sibling
        // driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[1]")).sendKeys("Dillip");
        
        // //preceding-sibling
        // driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding::td/child::input"));

        // //ancestor
        // driver.findElement(By.xpath("//button[@class='btn']/ancestor::div"));

        // //descendant
        // driver.findElement(By.xpath("//div[@class='container']/descendant::button[text()='Register']"));


