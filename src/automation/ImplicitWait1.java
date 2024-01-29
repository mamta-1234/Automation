package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWait1 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("India");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
		
	}

}
