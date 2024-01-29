package rahulsheetytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import rahulsheetypages.LoginPage;
import rahulsheetypages.RegisterPage;

public class BaseTest {
	
	public static WebDriver driver;
	 
	 RegisterPage registerpage;
	 
	 LoginPage loginpage;
	 
	 @BeforeSuite
	 public void launch() {
		 
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://rahulshettyacademy.com/client");
		 
		  }
	 
	 @BeforeClass
	 public void object() {
		 
		 registerpage = new RegisterPage(driver);
		 
		 loginpage = new LoginPage(driver);
	 }

}
