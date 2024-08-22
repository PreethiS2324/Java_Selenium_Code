package pom_framework_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	//initializing driver
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//object repository or element repository
	By username = By.name("username");
	By password = By.name("password");
	By login_button = By.xpath("//button[@type='submit']");
	
	public void EnterURL() throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
	}
	
	public void enterUsername(String user_name)
	{
		driver.findElement(username).sendKeys(user_name);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void click_login()
	{
		driver.findElement(login_button).click();
	}

}
