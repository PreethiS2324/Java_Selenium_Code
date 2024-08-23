package selenium_day1_06_June;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//ctrl+Shift+O to import 

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//Webdriver --> interface
		//ChromeDriver ==> class
		driver.manage().window().maximize(); //driver ==> instance of webdriver
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		System.out.println("CUrrent URL: "+driver.getCurrentUrl());
		Thread.sleep(2000); //for pausing the execution for 2ms
		String expected_title = "Facebook – log in or sign up";
		String actual_tile = driver.getTitle();
		
		if(expected_title.equals(actual_tile))
		{
			System.out.println("Title is matched");
		}
		else
		{
			System.out.println("Title not matched");
		}
		
		
		
		driver.close();
		
		

	}

}
