package excel_read;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/V4/index.php");
		String path = "C:\\Users\\LENOVO\\Desktop\\ExcelR\\Automation Testing\\input_selenium.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("credentials");
	
		int rows = sheet.getLastRowNum();
		for(int i =1;i<=rows;i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			System.out.println("Username: " +username.toString());
			System.out.println("Password: "+ password.toString());
			driver.findElement(By.name("uid")).sendKeys(username.toString());
			driver.findElement(By.name("password")).sendKeys(password.toString());
			Thread.sleep(2000);
			driver.findElement(By.name("btnLogin")).click();
			Thread.sleep(2000);
			Alert alert  = driver.switchTo().alert();
			alert.accept();
			
			//driver.close();
		}
		
	}
}
