package selenium_day5_13_June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		WebElement books = driver.findElement(By.linkText("BOOKS"));	
		Actions act = new Actions(driver);
		act.moveToElement(books).build().perform();
		Thread.sleep(2000);
		WebElement computer = driver.findElement(By.linkText("COMPUTERS"));
		act.moveToElement(computer).build().perform();
		
		
	}

}
