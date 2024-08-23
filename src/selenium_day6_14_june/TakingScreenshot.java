package selenium_day6_14_june;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakingScreenshot {

	public static void main(String[] args)  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location = new File(".//Screenshot//Fb.png");
		
	
		
		try {
			Files.copy(screenshot, location);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		 


		
	
	
	}

}
