package basicsofbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();//to the launch the browser
	
	driver.get("https://WWW.google.com");//go to google.com
	
	driver.close();//to close the browser
	
	FirefoxDriver driver2 = new FirefoxDriver();
	
	

	
}
}
