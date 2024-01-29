package actionClassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyandPaste {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname =driver.findElement(By.xpath("//*[@name='firstname']"));
		
		firstname.sendKeys("9 Sept batch");
	
		Actions act = new Actions(driver);
		
// Performing CTRL+A
		
		act.keyDown(Keys.CONTROL)
		.sendKeys("a")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
// Performing CTRL+C
		
		act.keyDown(Keys.CONTROL)
		.sendKeys("c")
		.keyUp(Keys.CONTROL)
		.build().perform();
		
// Performing CTRL+V
		
		act.sendKeys(Keys.TAB)
		.keyDown(Keys.CONTROL)
		.sendKeys("V")
		.keyUp(Keys.CONTROL)
		.build().perform();
	}
}
