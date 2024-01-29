package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNG {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
		
		
	}
	
	@AfterSuite
	public void bfterSuite()
	{
		System.out.println("After Suite");
	}
		
		
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("launching the browser");
	}

	
	
	@Test
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@Test
	public void profile() {
		
		System.out.println("Profile testcase");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("Closing the browser");
	}
	}
	
