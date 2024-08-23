package selenium_day8;


import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(selenium_day8.ListenersTest.class)
public class ListenersDemo {

	@Test
	public void login() throws InterruptedException
	{
		System.out.println("Login method");
	}
	@Test
	public void failTestcase()
	{
		Assert.assertFalse(true, "Failing intentionally");
	}
	@Test
	public void skipTestcase()
	{
		System.out.println("Skipping testcase");
		throw new SkipException("Skipping");
	}
}
