package a11_dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream file = new FileInputStream("./testDAta/fb.xlsx");
		Workbook wb = WorkbookFactory.create(file);

		String url = wb.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String un = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String pwd = wb.getSheet("Sheet1").getRow(2).getCell(0).toString();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to(url);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);

		Thread.sleep(2000);
//		driver.quit();
	}
}
