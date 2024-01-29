package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HPRTC {

	private static char[] cityname;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("man");
		
		Thread.sleep(1000);
		
		  List<WebElement> allcity = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
		  
		 for(WebElement city:allcity)
		 {
			 String cityname = city.getText();
		 
		 
		System.out.println(cityname);
	}
}
}
