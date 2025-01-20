package a01_webDriverMethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class s7_ToExploreManageMethod {

    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        //Full screen
        //driver.manage().window().fullscreen();

        //Maximize the screen
        //driver.manage().window().maximize();

        //Maximize the screen
        //driver.manage().window().minimize();

        //setsize
        driver.manage().window().setSize(new Dimension(500, 300));

        //getSize
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);

        //setPosition
        driver.manage().window().setPosition(new Point(100, 200));

        //getPosition
        Point positon = driver.manage().window().getPosition();
        System.out.println(positon);
    }
}