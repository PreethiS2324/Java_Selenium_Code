package selenium_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_dataprovider {

	WebDriver driver;
	@Test(dataProvider="dataset")
	public void login(String un, String pass) throws InterruptedException
	{
		System.out.println("Login method");
		System.out.println(un+"==>"+pass);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String expectedValue="Dashboard";
		String actualValue=driver.findElement(By.linkText("Dashboard")).getText();
		System.out.println("Actual Value: "+actualValue);
		Assert.assertEquals(expectedValue, actualValue);
		System.out.println("Logged in with: "+un+" ==>"+pass);
		System.out.println("Logged in successfully");
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
