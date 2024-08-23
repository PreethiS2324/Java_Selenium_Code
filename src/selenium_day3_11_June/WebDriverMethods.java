package selenium_day3_11_June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();//Webdriver --> interface
		//ChromeDriver ==> class
		driver.manage().window().maximize(); //driver ==> instance of webdriver
		driver.get("https://www.facebook.com/");
		
		System.out.println("Attribute: "+driver.findElement(By.name("email")).getAttribute("class"));
		System.out.println("Tag name: "+driver.findElement(By.name("email")).getTagName());
		
		Object size = driver.findElement(By.tagName("a")).getSize();
		

		driver.close();
	}

}
