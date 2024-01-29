package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToHandleIframe {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/datepicker/");
		 
		 
		 
		 WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		 
		 driver.switchTo().frame(iframe);
		 
		 driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		 
		 Thread.sleep(2000);
		 
		 while(true)
		 {
		 
		WebElement monthYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
		
		 String my = monthYear.getText();
		 System.out.println(my);
		 
		 String my1 = "July 2024";
		 
		 if(my.equals(my1))
		 {
			 break;
		 }
		 else
		 {
			 WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
			 
			 JavascriptExecutor js  = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", next);
		
		
			 
			 
		 }
		 
		 }
		
		driver.findElement(By.xpath("//*[@data-date='18']")).click();
		 }
		 

	
}

