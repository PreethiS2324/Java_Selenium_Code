package pom_framework_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageFactory {

	public WebDriver driver;
	public Login_PageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//button[@type='submit']") WebElement login_button;
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") WebElement image;
	@FindBy(linkText = "Logout") WebElement logout_button;
	
	public void Logout()
	{
		image.click();
		logout_button.click();
	}
	
	public void login(String un, String pass) throws InterruptedException
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		username.sendKeys(un);
		password.sendKeys(pass);
		login_button.click();
		
	}
}
