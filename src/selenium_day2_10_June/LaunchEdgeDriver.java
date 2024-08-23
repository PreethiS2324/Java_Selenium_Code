package selenium_day2_10_June;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class LaunchEdgeDriver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); //driver ==> instance of webdriver
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000); //for pausing the execution for 2ms
		driver.close();
		
		
	}

}
