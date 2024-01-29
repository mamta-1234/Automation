package actionClassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlreadyHaveAccountLink {
	
	
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/signup");
			
			WebElement alreadyHaveAccountLink = driver.findElement(By.xpath("//*[@class='_9bq5']"));
			
			Actions act = new Actions(driver);
			
			act.keyDown(Keys.CONTROL)
			.click(alreadyHaveAccountLink)			
			.keyUp(Keys.CONTROL)
			.build().perform();
			
			
			
	}

}
