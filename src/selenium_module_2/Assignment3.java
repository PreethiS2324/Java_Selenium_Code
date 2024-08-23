package selenium_module_2;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Assignment3 {

	public static void main(String[] args) {
	
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Draggable')]")).click();
		driver.switchTo().frame(0);
		
		WebElement element_to_drag = driver.findElement(By.id("draggable"));
		
		Actions act = new Actions(driver);
		 
		act.dragAndDropBy(element_to_drag,168, 25).build().perform();	

	   
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File location = new File(".//Screenshot//DragAndDrop.png");
			
			try {
				Files.copy(screenshot, location);
			} catch (IOException e) {
				e.printStackTrace();
			}

	        
	        
	}

}
