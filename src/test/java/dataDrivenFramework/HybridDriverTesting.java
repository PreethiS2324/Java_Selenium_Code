package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_framework_pages.LoginPage;
import pom_framework_pages.LogoutPage;

public class HybridDriverTesting {

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
		XSSFSheet data_sheet = wb.getSheet("input");
		XSSFSheet keyword_sheet = wb.getSheet("input_keyword_driven");
		int data_rows = data_sheet.getLastRowNum();
		int key_rows = keyword_sheet.getLastRowNum();
		for(int i =1;i<=data_rows;i++) {
			XSSFRow row = data_sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			System.out.println(username+"===>"+password);
			try {
			for(int kr =1; kr<=key_rows;kr++)
			{
				XSSFRow krow= keyword_sheet.getRow(kr);
				XSSFCell keyword = krow.getCell(1);

				System.out.println(keyword);
				switch(keyword.toString())
				{
				case "url":lp.EnterURL();
				break;
				case "username":lp.enterUsername(username.toString());
				break;
				case "password":lp.enterPassword(password.toString());
				break;
				case "login":lp.click_login();
				break;
				case "image":log_out.click_image();
				break;
				case "logout":log_out.click_Logout();	
				break;
				default:System.out.println("Invalid Data");
				break;
				}
				
			}
			}
			catch(Exception e)
			{
				System.out.println("Invalid Credentials");
			}
	}

}
}