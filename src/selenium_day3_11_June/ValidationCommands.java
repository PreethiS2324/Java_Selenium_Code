package selenium_day3_11_June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationCommands {
	
	//isDisplayed(),  isEnabled(), isSelected()

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();//Webdriver --> interface
		//ChromeDriver ==> class
		driver.manage().window().maximize(); //driver ==> instance of webdriver
		driver.get("https://www.facebook.com/");
		
		boolean email = driver.findElement(By.name("email")).isDisplayed();
		System.out.println("Is email text box displayed: "+email);
		
		
		
		boolean pwd = driver.findElement(By.id("email")).isEnabled();
		System.out.println("Is pwd text box enabled: "+pwd);
		
		driver.close();
	}

}
