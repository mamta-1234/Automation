package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionHandlingGoogle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		List<WebElement> searchResults = driver.findElements(By.xpath("//*[text()='selenium']"));
		
		for(WebElement element :searchResults)
		{
			String textValue = element.getText();
			
			System.out.println(textValue);
			
			if(textValue.equals("selenium interview questions"))
				
			{
				element.click();
			}
		
	}

}
}