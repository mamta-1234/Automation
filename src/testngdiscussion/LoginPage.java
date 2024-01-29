package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}

	
	
	
	@Test
	public void loginToApp()
	{
		System.out.println("Login to application ");
	}
	
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class");
	}
	
	
	
	@Test
	public void getTitle() {
		System.out.println("Validating login page title");
	}
}
