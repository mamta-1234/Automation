package assignmentdropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YearvaluePrint {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		List<WebElement> allyears =driver.findElements(By.xpath("//*[@name='birthday_year']"));
		
		for(WebElement year: allyears)
		{
			String yr = year.getText();
			
			System.out.println(yr);
		}
		
		
	
		
	
		
	}

}
