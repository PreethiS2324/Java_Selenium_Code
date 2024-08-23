package selenium_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Annotation1 {

	WebDriver driver;
	//BeforeMethod will execute before each and every test method
	@BeforeMethod
	public void LaunchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser is launced");
	}
	@Test
	public void EnterURL()
	
	{
		System.out.println("URL is entereds");
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void EnterURL2()
	
	{
		System.out.println("URL2 is entereds");
		driver.get("https://demowebshop.tricentis.com/");
	}
	//AfterMethod will execute after each and every test method
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Browser is closed");
	}
}
