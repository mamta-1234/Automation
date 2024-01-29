package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://jqueryui.com/datepicker/");
		 
		Thread.sleep(2000);
		 
		 WebElement frame = driver.findElement(By.xpath("//*[@class=\"demo-frame\"]"));
		 
		 driver.switchTo().frame(frame);
		 
		 driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
		 while(true)
		 {
		 String monthYear = driver.findElement(By.xpath("//*[@class=\"ui-datepicker-title\"]")).getText();
		 
		 System.out.println(monthYear);
		 if(monthYear.equals("August 2022"))
		 {
			 break;
		 }
		 else
		 {
			 driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();
		 }
		 
		 
	}
		 
		 driver.findElement(By.xpath("//*[@data-date=\"22\"]")).click();

}
}