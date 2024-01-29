package actionClassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
// mouse hover action
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement SignIn =driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(SignIn).perform();
		
		act.contextClick().perform();
		
		
	}
	
	

}
