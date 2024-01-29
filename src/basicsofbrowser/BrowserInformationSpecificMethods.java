package basicsofbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserInformationSpecificMethods {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String titleOfpage = driver.getTitle();// this method returns the title
		
		System.out.println(titleOfpage);// print the title - sign up for the Facebook
		
		String urlOfpage = driver.getCurrentUrl();// this method returns the current url of page
		
		System.out.println(urlOfpage);//https://www. facebook.com/signup
	}

}
