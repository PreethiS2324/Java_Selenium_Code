package selenium_day3_11_June;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links: "+links);
		for(int i =0; i<links.size();i++)
		{
			String link = links.get(i).getText();
			String href = links.get(i).getAttribute("href");
			if(link.startsWith("M"))
			{
				System.out.println(link+" " +href);
			}
			
		}
		
	

		
	}
	
}
