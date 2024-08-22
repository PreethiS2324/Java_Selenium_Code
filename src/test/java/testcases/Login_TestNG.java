package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_framework_pages.LoginPage;
import pom_framework_pages.Login_PageFactory;

public class Login_TestNG {
	
	WebDriver driver;
	LoginPage lp;
	@Test
	public void LaunchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test(enabled=false)
	public void Login() throws InterruptedException
	{
		lp = new LoginPage(driver);
		lp.EnterURL();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.click_login();
	}
	
	Login_PageFactory login_PF;
	@Test
	public void Login_PF() throws InterruptedException
	{
		login_PF = new Login_PageFactory(driver);
		Thread.sleep(2000);
		login_PF.login("Admin", "admin123");
		Thread.sleep(2000);
		login_PF.Logout();
	}

}
