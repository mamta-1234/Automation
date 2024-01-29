package actionClassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUsingBestSellersProducts {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement element = driver.findElement(By.xpath("//*[text()='Best Sellers in Sports, Fitness & Outdoors']"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(element).perform();
}
}
