package basicsofbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	
	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");// go to google
	
	driver.manage().window().maximize();//maximize the browser
	
	driver.get("https://www.facebook.com");// go to facebook
	
	 driver.navigate().back();//browser back button will get execute
	 
	 Thread.sleep(2000);
	
	 driver.navigate().forward();// browser forward button will get execute
	  
	 driver.navigate().refresh();
	 
	 driver.close();
	 }
	}


