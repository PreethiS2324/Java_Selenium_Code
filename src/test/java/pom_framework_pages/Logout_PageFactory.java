package pom_framework_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_PageFactory {

	public WebDriver driver;
	
	public Logout_PageFactory(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']") WebElement image;
	@FindBy(linkText = "Logout") WebElement logout_button;
	
	
	public void Logout()
	{
		image.click();
		logout_button.click();
	}
}
