package selenium_TestNG;

import org.testng.annotations.*;

public class TestNG_groups {

	@Test(groups= {"Sanity"})
	public void test()
	{
		System.out.println("Test method");
	}
	@Test(groups= {"Smoke"})
	public void test1()
	{
		System.out.println("Test1 method");
	}
	@Test(groups= {"Smoke","Sanity"})
	public void test2()
	{
		System.out.println("Test2 method");
	}
	@Test(groups= {"Regression"})
	public void test3()
	{
		System.out.println("Test3 method");
	}
	@Test(groups= {"Smoke, Sanity"})
	public void test4()
	{
		System.out.println("Test4 method");
	}
	@Test(groups= {"Sanity"})
	public void test5()
	{
		System.out.println("Test5 method");
	}
	@Test(groups= {"Smoke"})
	public void test6()
	{
		System.out.println("Test6 method");
	}
}
