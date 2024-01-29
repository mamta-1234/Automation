package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesForListeners {
	
	WebDriver driver;
	
	@Test
	public void testCase1() {
		
		System.out.println("TestCase 1");
		
		Assert.assertTrue(false);
	}
	

}
