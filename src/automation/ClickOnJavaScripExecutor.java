package automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnJavaScripExecutor {

	
public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
		WebElement mobileSection = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		
		mobileSection.click();
		
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			js.executeScript("argument[0].click();", mobileSection);

}			



}
