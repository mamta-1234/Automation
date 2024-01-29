package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class CustomizationOfXpath {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
	
// contains()
		
			WebElement firstname = driver.findElement(By.xpath("//input[contains(@id,'u_2_b_')]"));
			
			firstname.sendKeys("typing using xpath");

//indexing
			
		WebElement Mobile = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		
		Mobile.sendKeys("9156645235");

// starts_with
		
	WebElement lastname = driver.findElement(By.xpath("//input[starts_with(@name,'las')]"));
		
		lastname.sendKeys("typing using starts with");
	
	}
}
