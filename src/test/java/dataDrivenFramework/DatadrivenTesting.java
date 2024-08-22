package dataDrivenFramework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenTesting {

	public static void main(String[] args) throws Exception  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String path = "C:\\Users\\LENOVO\\Desktop\\ExcelR\\Automation Testing\\input_selenium.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("input");
		
		int rows = sheet.getLastRowNum();
		for(int i =1;i<=rows;i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			Thread.sleep(2000);
			System.out.println("Username: " +username.toString());
			System.out.println("Password: "+ password.toString());
			try {
			driver.findElement(By.name("username")).sendKeys(username.toString());
			driver.findElement(By.name("password")).sendKeys(password.toString());
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Logout")).click();
			System.out.println("Logged out: "+password.toString());
			}
			catch(Exception e)
			{
				System.out.println("Invalid credentials");
			}
		}
		
	}

}
