package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

	public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;//type casting driver to the TakeScrreshot
		
		File Source = ts.getScreenshotAs(OutputType.FILE);//capturing the screenshot 
		
		String path = "C:\\Users\\ASUS\\Desktop\\CaptureScreenshot\\amazonpage.jpg";// defining the path of system where we want to store the screenshot
	
		File file = new File(path);// to locate the path as system path
		
		FileHandler.copy(Source, file);// to copy the screenshot to the defined 
	
	
	
	
	}
}
