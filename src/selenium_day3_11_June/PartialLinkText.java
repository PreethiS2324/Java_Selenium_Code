package selenium_day3_11_June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//Webdriver --> interface
		//ChromeDriver ==> class
		driver.manage().window().maximize(); //driver ==> instance of webdriver
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
