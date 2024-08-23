package selenium_day3_11_June;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();//Webdriver --> interface
		//ChromeDriver ==> class
		driver.manage().window().maximize(); //driver ==> instance of webdriver
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+links.size());
		
		for(int i = 0; i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
		}
		driver.close();

	}

}
