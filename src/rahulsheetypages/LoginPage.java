package rahulsheetypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@id='userEmail']")
	WebElement userEmail;
	
	@FindBy(xpath = "//*[@id='userPassword']")
	WebElement userPassword;
	
	@FindBy(xpath = "//*[@id='login']")
	WebElement loginButton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
		
	}
	public void userCredentials() {
		
		userEmail.sendKeys("jhdhsk@gmail.com");
		
		userPassword.sendKeys("Megha@1234");
		
		loginButton.click();
	}
	

}
