package selenium_module_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		String expected_title = "Radio Button & Check Box Demo";
		String actual_title = driver.getTitle();
		if(actual_title.equals(expected_title))
		{
			System.out.println("Title of the page is: " + actual_title + "\n and the title is matched");
		}
		else
			System.out.println("Title is not matched");
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='Option 1']")).click();

		driver.findElement(By.xpath("//input[@type='checkbox'][@value='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][@value='checkbox3']")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		WebElement country = driver.findElement(By.name("country"));
		Select s = new Select(country);
		s.selectByVisibleText("KUWAIT");
		
		driver.close();
	}

}
