package selenium_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG_Annotation2 {


	
	WebDriver driver;
	//BeforeSuite  will execute before test method
		@BeforeSuite
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
		//AfterSuite will execute once after all test methods are executed
		@AfterSuite
		public void closeBrowser()
		{
			System.out.println("Browser is closed");
			driver.close();
		}

}
