package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExpectedResult {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		String URL = driver.getCurrentUrl();
		int title_len = title.length();
		int url_len = URL.length();
		System.out.println("Length of the title: "+title_len);
		System.out.println("Length of the URL: "+url_len);
		if(title_len>url_len)
			System.out.println("Application Title length is greater than the application URL length");
		else
			System.out.println("Application Title length is not greater than the application URL length");
			
		WebElement login = driver.findElement(By.name("login"));
		boolean login_enable = login.isEnabled();
		
		if(login_enable)
		{
			System.out.println("Login button is enabled");
			login.click();
		}
		else
			System.out.println("Login button is disabled");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		String cur_title = driver.getTitle();
		System.out.println("Title: "+cur_title);
		if(!cur_title.contains("account1"))
			System.out.println("Title does not contains 'account1'");
		
		boolean search = driver.findElement(By.id("did_submit")).isEnabled();
		if(search)
			System.out.println("Search button is enabled");
		else
			System.out.println("Search button is disabled");

	}

}
