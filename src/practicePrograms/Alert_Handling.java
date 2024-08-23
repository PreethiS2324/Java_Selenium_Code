package practicePrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		Alert al1 = driver.switchTo().alert();
		al1.sendKeys("Preethi");
		
		al1.accept();
		
		

	}

}
