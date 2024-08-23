package selenium_TestNG;

import org.testng.annotations.*;

public class TestNG_Annotations3 {

	@Test
	public void signup()
	{
		System.out.println("Signup");
	}
	@Test(dependsOnMethods="signup")
	public void login()
	{
		System.out.println("Login");
	}
}
