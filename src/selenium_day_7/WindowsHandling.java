package selenium_day_7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.linkText("HOTELS")).click();
		System.out.println("Title: "+driver.getTitle());
		String parentwindow =  driver.getWindowHandle();
		System.out.println("Parent Window: "+parentwindow);
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator itr = allWindows.iterator();
		while(itr.hasNext())
		{
			String childWindow = (String) itr.next();
			System.out.println(childWindow);
			if(!parentwindow.equals(childWindow))
			{
				driver.switchTo().window(childWindow);
				Thread.sleep(2000);
				driver.findElement(By.linkText("Bus Tickets")).click();
				System.out.println("Title: "+driver.getTitle());
				driver.close();
			}
		}
		
		driver.quit();
		
	}

}
