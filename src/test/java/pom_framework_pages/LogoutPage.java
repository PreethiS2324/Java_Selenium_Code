package pom_framework_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

	WebDriver driver;
	
	public LogoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By image = By.xpath("//span[@class='oxd-userdropdown-tab']");
	By logout = By.linkText("Logout");
	
	public void click_image() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(image).click();
	}

	public void click_Logout() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(logout).click();
	}
}
