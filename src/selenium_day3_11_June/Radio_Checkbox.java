package selenium_day3_11_June;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Checkbox {

	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.id("pollanswers-2")).click();
		boolean radio3 = driver.findElement(By.id("pollanswers-3")).isSelected();
		System.out.println("Radio 3 is selected: "+radio3);
		
		boolean radio2 = driver.findElement(By.id("pollanswers-2")).isSelected();
		System.out.println("Radio 2 is selected: "+radio2);
		
	}

}
