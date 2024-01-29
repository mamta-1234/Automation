package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitsWaitWithAmazon {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.navigate().refresh();
		
		WebElement homeshoppingspree = driver.findElement(By.xpath("//*[@alt=\"Amazon Home Shopping Spree\"]"));
		
		WebDriverWait wait = new  WebDriverWait(driver,Duration.ofSeconds(60));

		wait.until(ExpectedConditions.visibilityOf(homeshoppingspree));
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();",homeshoppingspree);
	

	}

	
}
