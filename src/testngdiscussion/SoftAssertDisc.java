package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDisc {

	
	@Test
	public void testcase1() {
		
		String expected = "abc";
		String actual  = "Abc";
		
		
		
// Applying soft assertion to compare the actual and expected value
			
		SoftAssert sa = new SoftAssert();		
		sa.assertEquals(actual, expected);
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String titleOfPage = driver.getTitle();
		
		System.out.println(titleOfPage);
		
		boolean isContains = titleOfPage.contains("Shopping");
	
		
		
		sa.assertEquals(isContains, true);
		
		System.out.println("Test case last line");
		
		sa.assertAll();
	
}
	@Test
	public void testCase2()
	{
		boolean a = true;
		SoftAssert sa = new SoftAssert();
		Assert.assertTrue(a);
		
		sa.assertAll();

	}
}