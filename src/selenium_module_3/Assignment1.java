package selenium_module_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Assignment1 {

	
	WebDriver driver;
	@BeforeTest	
	public void DriverInitialization()
		{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		}
		
	@Test(dataProvider="dataset")
	public void login(String username, String password) throws InterruptedException
	{
	driver.get("https://demo.guru99.com/test/login.html");
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("passwd")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
	Thread.sleep(2000);
	}	

	//@AfterTest
	public void DriverClose()
	{
		driver.close();
	}
	

	@DataProvider(name="dataset")
	public Object[][] dataproviderMethod()
	{
		return new Object[][]
				{
					{"Admin", "admin123"},
					{"username2", "pwd2"},
					{"username3", "pwd3"}
				};
	}

}
