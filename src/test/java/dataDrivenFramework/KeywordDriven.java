package dataDrivenFramework;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_framework_pages.LoginPage;
import pom_framework_pages.LogoutPage;

public class KeywordDriven {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage lp = new LoginPage(driver);
		LogoutPage log_out =new LogoutPage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String path = "C:\\Users\\LENOVO\\Desktop\\ExcelR\\Automation Testing\\input_selenium.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("input_keyword_driven");
		
		int rows = sheet.getLastRowNum();
		for(int i =1;i<=rows;i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell keyword = row.getCell(1);
			System.out.println(keyword);
			switch(keyword.toString())
			{
			case "url":lp.EnterURL();
			break;
			case "username":lp.enterUsername("Admin");
			break;
			case "password":lp.enterPassword("admin123");
			break;
			case "login":lp.click_login();
			break;
			case "image":log_out.click_image();
			break;
			case "logout":log_out.click_Logout();	
			}
		
	}

}
}