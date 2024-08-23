package selenium_day2_10_June;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();//Webdriver --> interface
		//ChromeDriver ==> class
		driver.manage().window().maximize(); //driver ==> instance of webdriver
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000); //for pausing the execution for 2ms
		driver.close();
		

	}

}
