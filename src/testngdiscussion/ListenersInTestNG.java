package testngdiscussion;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.ScreenshotWithMethod;

public class ListenersInTestNG extends TestNGListenersWithSelenium implements ITestListener {

	 
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase passed");
		
			String nameOfTestCase = result.getName();
			
			System.out.println(nameOfTestCase+"Test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String nameOfTestCase = null;
		System.out.println(nameOfTestCase+  "TestCase failed");
		
		ScreenshotWithMethod sc = new ScreenshotWithMethod();
     
		try {
			sc.captureScreenshot(driver,result.getName());
		} catch (IOException e) {
			
			System.out.println("Exception arrived while taking scrrenshot");
			
		}
		
		}
	
	
	


	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag finished");

	
	
}
}