package selenium_day4_12_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSSelector_Demo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.cssSelector("#email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		
		Select bday_day = new Select(driver.findElement(By.name("birthday_day")));
		bday_day.selectByIndex(2);
		
	}

}
