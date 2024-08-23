package selenium_day2_10_June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();//Webdriver --> interface
		//ChromeDriver ==> class
		driver.manage().window().maximize(); //driver ==> instance of webdriver
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("Preethi");
		driver.findElement(By.name("lastname")).sendKeys("Selvamani");
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abc");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("birthday_day")).sendKeys("");
		driver.findElement(By.name("birthday_month")).sendKeys("Jan");
		driver.findElement(By.name("birthday_year")).sendKeys("2000");

	}

}
