package basicsofbrows;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("sept batch");		
		
		
		
		
	}
}
