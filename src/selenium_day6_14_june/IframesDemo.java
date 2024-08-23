package selenium_day6_14_june;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		System.out.println("Total frames: "+frames.size());
		//using frame index driver.switchTo().frame(0);
		
		//using frame name
		driver.switchTo().frame("packageListFrame");
		
		//using webelement
		//WebElement frame = driver.findElement(By.name("packageListFrame"));
		//driver.switchTo().frame(frame);
		driver.findElement(By.linkText("java.applet")).click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Applet")).click();
		
		

	}

}
