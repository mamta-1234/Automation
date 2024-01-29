package actionClassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
// perform key tab opeartion
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//*[@name='firstname']")).click();
		
		act.sendKeys("Velocity").perform();
		
		act.sendKeys(Keys.TAB).sendKeys("Corporate").sendKeys(Keys.TAB).build().perform();
		
		act.sendKeys(Keys.TAB).sendKeys("mamtapimpalshede@gmail.com").sendKeys(Keys.TAB).build().perform();
}
}
