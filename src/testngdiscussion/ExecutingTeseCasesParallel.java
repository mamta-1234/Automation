package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ExecutingTeseCasesParallel {

//	@Test
//	public void testCase1() {
//		
//		System.out.println("TestCase 1");
//	}
//	
//	
//	@Test
//	public void testCase2() {
//		
//		System.out.println("TestCase 2");
//}
//
//	@Test
//	public void testCase3() {
//		
//		System.out.println("TestCase 3");
//		
//}
	
	@Test
	public void launchChrome() {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.in/");
	}
		
}