package extentlisteners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import rahulsheetytest.BaseTest;
import utility.ScreenshotWithMethod;

public class TestNGListeners extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase started"+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String nameOfTestCase = result.getName();
		
		System.out.println(nameOfTestCase+" Test case passed");
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		String nameOfTestCase = result.getName();
		
		System.out.println(nameOfTestCase+" Test case failed");
	
		
		ScreenshotWithMethod sc = new ScreenshotWithMethod();
	     
		try {
		
			sc.captureScreenshot(driver,result.getName());
		} catch (IOException e) {
			
			System.out.println("Exception arrived while taking scrrenshot");
			
	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
}

	