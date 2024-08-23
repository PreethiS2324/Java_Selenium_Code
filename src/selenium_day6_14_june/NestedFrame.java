package selenium_day6_14_june;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		
		
		//check code
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		boolean parent = driver.findElement(By.linkText("Parent frame")).isDisplayed();
		if(parent)
		{
			System.out.println("Parent frame");
		}
		driver.switchTo().frame(0);
		boolean child = driver.findElement(By.linkText("Child Iframe")).isDisplayed();
		if(child)
		{
			System.out.println("Child frame");
		}

	}

}
