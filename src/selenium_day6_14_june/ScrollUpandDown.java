package selenium_day6_14_june;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollUpandDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.facebook.com/");	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//to scroll down
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		//to scroll up
		js.executeScript("window.scrollBy(0,-300)", "");
	
	}

}
