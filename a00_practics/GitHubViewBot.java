package a00_practics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GitHubViewBot {
    public static void main(String[] args) {

        String url = "https://github.com/DillipKumarMeher";
        int views = 100;

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in the background

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        try {
            for (int i = 1; i <= views; i++) {
                driver.get(url);
                // System.out.println("View " + i + " completed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
