package selenium_TestNG;

import org.testng.annotations.*;

public class TestNG_Annotations {
	
	
	//will execute first ex:launch url
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("BeforeSuite method");
	}
	
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest method");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass method");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("BeforeMethod method");
	}
	
	@Test
	public void Test()
	{
		System.out.println("Test case");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod method");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("AfterClass method");
	}
	@AfterTest
	public void AfterTest()
	{
		System.out.println("AfterTest method");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("AfterSuite method");
	}
	

}


