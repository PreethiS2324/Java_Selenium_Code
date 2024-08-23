package selenium_TestNG;

import org.testng.annotations.Test;

public class TestNG1 {
	
	//using TestNG we can execute methods without main method
	//if priority is same for multiple methods/testcase it will execute based on Alpha numeric method name
	//priority can be negative and it will execute first based on smallest number
	//invocationCount ==> number of times test case has to be executed
	//to skip the testcase ==> invocationCount = 0 or enabled=false
	//rightclick on package and click TestNG -->conver to xml file. Then run as TestNG suite
	
	@Test(priority=1,invocationCount=4)
	public void test()
	{
		System.out.println("Test Method");
	}
	
	@Test(priority=3, invocationCount=2)
	public void test2()
	{
		System.out.println("Test2 method");
	}
	
	@Test(priority=-2,enabled=false)
	public void test3()
	{
		System.out.println("test3 method");
	}
	
	@Test(priority=1)
	public void atest4()
	{
		System.out.println("Test4 method");
	}
	
	//it wont execute because we are not using @Test for this method
	public void test5()
	{
		System.out.println("test5 method");
	}

}
