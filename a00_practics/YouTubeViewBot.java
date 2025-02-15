package a00_practics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YouTubeViewBot {
    public static void main(String[] args) {
        String videoUrl = "https://youtu.be/8X2mW5Fuv5k";
        int views = 100;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Remove if you want to see the browser
        options.addArguments("--mute-audio"); // Mute the video

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        try {
            for (int i = 1; i <= views; i++) {
                driver.get(videoUrl);
                Thread.sleep(40000);
                // System.out.println("View " + i + " completed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
