package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom_framework_pages.LoginPage;
import pom_framework_pages.LogoutPage;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(driver);
		lp.EnterURL();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.click_login();
		
		LogoutPage log_out = new LogoutPage(driver);
		log_out.click_image();
		log_out.click_Logout();
	
	}

}
