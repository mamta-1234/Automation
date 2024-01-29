package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsertsInTestNG {

	@Test
	public void testcase1() {
		
		String expected = "abc";
		String actual  = "Abc";
		
		
		
// Applying assertion to compare the actual and expected value
			
		Assert.assertEquals(actual, expected);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String titleOfPage = driver.getTitle();
		
		System.out.println(titleOfPage);
		
		boolean isContains = titleOfPage.contains("Shopping");
	
		Assert.assertEquals(isContains, true);
	
	
		
	}
	@Test
	public void testCase2()
	{
		boolean a = true;
		
		Assert.assertTrue(a);
	}
	@ Test
	public void testcase3() {
		
		
		boolean b = false;
		
		Assert.assertFalse(b);
	}
	
	@Test
	public void testCase4() {
		String a = "abc";
		String  b = "abc";
		
		System.out.println("Before assertion");
		
		Assert.assertEquals(a, b);
		
		System.out.println("After assertion");
		
		 boolean c = true;
		 
		 boolean d = false;
		 
		 Assert.assertTrue(d);
		 
		 System.out.println("After Assert true method");
	}

}



