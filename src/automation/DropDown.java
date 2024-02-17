package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		Thread.sleep(2000);
		
		WebElement dayDropDown = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select selDay = new Select(dayDropDown);
		
		selDay.selectByVisibleText("13");
		
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select selMonth = new Select(monthDropDown);
		
		selMonth.selectByIndex(9);
		
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select selYear = new Select(yearDropDown);
		
		selYear.selectByValue("2010");
		
	}
	

}
