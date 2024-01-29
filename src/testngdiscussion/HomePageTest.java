package testngdiscussion;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {
	
	@BeforeSuite
	public void beforesuit() {
		System.out.println("Before suite is executing");
	}
	
	
	@AfterSuite()
	public void afterSuite() {
		System.out.println("After suite is executing");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test");
	}
	
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
	
	
	@Test
	public void verifyUrl()
	{
		System.err.println("Verification of url");
	}
	
	
	
	@Test
	public void validateCarousel() {
		
		System.out.println("Carousel validation");
	}

}

