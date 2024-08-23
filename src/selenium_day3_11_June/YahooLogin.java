package selenium_day3_11_June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		WebElement username =driver.findElement(By.id("login-username"));
		username.sendKeys("abec@gmail.com");
		driver.findElement(By.id("login-signin")).click();
		
		driver.close();
		
		

	}

}
