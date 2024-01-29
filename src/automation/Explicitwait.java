package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		 
		WebElement butttonElement = driver.findElement(By.xpath("//*[@id=\"disable\"]"));
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 
		 wait.until(ExpectedConditions.elementToBeClickable(butttonElement));
		 
		 driver.findElement(By.xpath("//*[@id=\"enable-button\"]")).click();
		 
		 
		 
	}

}
