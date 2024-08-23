package selenium_day5_13_June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select sel_day = new Select(day);
		sel_day.selectByIndex(0);
		WebElement month = driver.findElement(By.id("month"));
		Select sel_month = new Select(month);
		sel_month.selectByIndex(0);
		WebElement year = driver.findElement(By.id("year"));
		Select sel_year = new Select(year);
		sel_year.selectByVisibleText("1995");
		
		DropDown.SelectMethod(day,"01");
		DropDown.SelectMethod(month,"Jan");
		DropDown.SelectMethod(year,"1995");
		
		
	}
	
	public static void SelectMethod(WebElement element, String value)
	{
		Select sel_year = new Select(element);
		sel_year.selectByVisibleText(value);
	}

}
