package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitswaits {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@id=\"enable-button\"]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

// handling enable condition of button
		
		WebElement buttonElement = driver.findElement(By.xpath("//*[@id=\"disable\"]"));
		
		wait.until(ExpectedConditions.elementToBeClickable(buttonElement));//this will wait till the element doesn't comes with clicakable state

		driver.findElement(By.xpath("//*[@id=\"enable-button\"]")).click();

// assignment: WAP to handle the alert specific condition using Explicit way
	
// wait.until(ExpectationConditions.alertIspresent());

		
	driver.findElement(By.xpath("//*[@id=\"alert\"]")).click();
		
	wait.until(ExpectedConditions.alertIsPresent());
	
	driver.switchTo().alert().accept();
	
// handling hidden condition	
	
	driver.findElement(By.xpath("//*[@id=\"display-other-button\"]")).click();
	
	WebElement hiddenButton = driver.findElement(By.xpath("//*[@id=\"hidden\"]"));
	
	wait.until(ExpectedConditions.visibilityOf(hiddenButton));
	
	driver.findElement(By.xpath("//*[@id=\"display-other-button\"]")).click();

	WebElement seleniumwebDriver = driver.findElement(By.xpath("//*[@id=\"h2\"]"));
	
	wait.until(ExpectedConditions.textToBePresentInElement(buttonElement, "seleniumwebDriver"));
	
	}
	
}