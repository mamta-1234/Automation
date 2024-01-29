package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement dayDropdown = driver.findElement(By.xpath("//select[@id='day']"));
	
// create the object of select class
		
		 Select selDay = new Select(dayDropdown);
	
		 selDay.selectByVisibleText("14");
	
		WebElement monthdropdown = driver.findElement(By.xpath("//select[@id='month']")); 
		 
		 Select selMonth = new Select(monthdropdown);
	
		 selMonth.selectByValue("9");
		 
		WebElement YearDropdown = driver.findElement(By.xpath("//select[@id='year']"));
		 
		 Select selYear = new Select(YearDropdown);
				 
		 selYear.selectByIndex(6);
	
		 dayDropdown.sendKeys("16");// based on manual behvaiour we can also use send keys methods to select the element
	
	
	}
}
