package selenium_day5_13_June;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(2000);
		al.accept();
		
		
	}

}
