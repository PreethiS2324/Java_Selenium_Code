package selenium_day_7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='countries']//tr[1]/td"));
	System.out.println("No of rows: "+rows.size());
	System.out.println("No of columns :"+columns.size());
	for(int r=1;r<rows.size();r++)
	{
		for(int c=1;c<columns.size();c++)
		{
			String values = driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]/td["+c+"]")).getText();
		System.out.println(values);
		}
			
	}
	//printing only countries
	for(int r=1;r<rows.size();r++)
	{
	String countries = driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]/td[2]")).getText();
	System.out.println(countries);
	}

}}
