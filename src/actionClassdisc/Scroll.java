package actionClassdisc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	public class Scroll {
	
		public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		WebElement element = driver.findElement(By.xpath("//*[text()='Top Deals']"));
		
		Actions act = new Actions(driver);
		
		act.scrollToElement(element).perform();

}
}
	