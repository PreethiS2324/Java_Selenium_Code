package selenium_day5_13_June;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(5000);
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		Alert al1 = driver.switchTo().alert();
		System.out.println(al1.getText());
		Thread.sleep(2000);
		al1.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		Alert al2 = driver.switchTo().alert();
		al2.dismiss();
		
		
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		Alert al3 = driver.switchTo().alert();
		al3.sendKeys("Preethi");
		al3.dismiss();
		
		
		
	}

}
