package selenium_day3_11_June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterDemoSite {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("abc");
		driver.findElement(By.id("LastName")).sendKeys("xyz");
		driver.findElement(By.id("Email")).sendKeys("pree112@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("qwerty@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("qwerty@123");
		driver.findElement(By.id("register-button")).click();
		
		driver.findElement(By.className("account")).click();
		
		System.out.println("Title of the page: "+driver.getTitle());
		
	}

}
