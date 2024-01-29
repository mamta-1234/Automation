package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindowHandling {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String ParentWinId = driver.getWindowHandle();// to get the id of window which got open first i.e parent window id
		
		System.out.println(ParentWinId);
		
		driver.findElement(By.xpath("//*[@id=\"non-users-notice-link\"]")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		
		
		driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("firstname typing");

		
		for(String wihId:allWindowId)
		{
			System.out.println(wihId);
			
			if(!(wihId.equals(ParentWinId)))
			{
				driver.switchTo().window(wihId);
			}
		}
	
		
		driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys("Testing type");

	}

}
