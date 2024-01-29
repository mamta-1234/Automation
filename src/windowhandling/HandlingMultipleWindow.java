package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWindow {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String ParentWinId = driver.getWindowHandle();// to get the id of window which got open first i.e parent window id
		
		System.out.println(ParentWinId);
		
		driver.findElement(By.xpath("//*[@id=\"non-users-notice-link\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"non-users-notice-link\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"non-users-notice-link\"]")).click();
		
		
		 Set<String> allwinId = driver.getWindowHandles();
		
		int totalNumberOfWindows = allwinId.size();
		
		
		
		String [] strArray = new String[4];
		 
		 Set<String> allwinId1 = driver.getWindowHandles();
		 int i =0;
		for(String winId:allwinId1)
		{
			
			strArray [i] = winId;
			i++;
		}
		for(String id:strArray)
		{
			System.out.println(id);
			
			driver.switchTo().window(strArray[2]);
			
			driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Testing type");
		
			driver.close();// This is to close the current window on which seelnium is having focus but not all windows
			
			Thread.sleep(2000);
			
			
			driver.quit();
		}
	}

}
