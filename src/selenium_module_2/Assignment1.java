package selenium_module_2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@class='dataTable']//tr"));

		for(int i=1;i<rows.size();i++)
		{
			String companies = driver.findElement(By.xpath("//*[@class='dataTable']//tr["+i+"]/td")).getText();
		
		System.out.println(companies);
		}
		
		//driver.close();

	}

}
