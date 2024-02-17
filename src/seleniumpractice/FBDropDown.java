package seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	   driver.findElement(By.linkText("Create new account")).click();
	   
	   Thread.sleep(2000);
	   List<WebElement> searchDays = driver.findElements(By.xpath("//*[@id='day']/option"));
	   
	   for(WebElement day :searchDays)
	   {
		  String value = day.getText();
		  
		  System.out.println(value);
		}
	
		
	}

}
