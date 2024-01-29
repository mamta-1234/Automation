package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotWithMethod {
	
	public void captureScreenshot(WebDriver driver, String filename) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;//type casting driver to the TakeScrreshot
		
		File Source = ts.getScreenshotAs(OutputType.FILE);//capturing the screenshot 
		
		String path = System.getProperty("user.dir")+"//ScreenShots//filename//amazonscreenshot.jpg";
	
		File file = new File(path);// to locate the path as system path
		
		FileHandler.copy(Source, file);// to copy the screenshot to the defined 
	
	}

}
