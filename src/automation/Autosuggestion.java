package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(2000);
		
		List<WebElement> yearValues = driver.findElements(By.xpath("//*[@id='year']/option"));
		
		int totalNumberOfValue = yearValues.size();
		
		System.out.println(totalNumberOfValue);
		
		for(WebElement yearvalue :yearValues)
		{
			String value=yearvalue.getText();
			
			System.out.println(value);
		}
		
		
	}

}
