package rahulsheetypages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Register']")
	WebElement register;
	
	@FindBy(xpath = "//*[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath = "//*[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath = "//*[@id='userEmail']")
	WebElement userEmail;
	
	@FindBy(xpath = "//*[@id='userMobile']")
	WebElement userMobile;
	
	@FindBy(xpath = "//*[@formcontrolname='occupation']")
	WebElement chooseYourOccupation;
	
	@FindBy(xpath = "//*[text()='Female']")
	WebElement gender;
	
	@FindBy(xpath = "//*[@id='userPassword']")
	WebElement userPassword;
	
	@FindBy(xpath = "//*[@id='confirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath = "//*[@type='checkbox']")
	WebElement checkBox;
	
	@FindBy(xpath = "//*[@id='login']")
	WebElement finalRegisterButton;

	@FindBy(xpath = "//*[text()='Login']")
	WebElement loginButton;

	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnRegister() {
		
		register.click();
	}
	
	public void userDetails() {
		
		firstName.sendKeys("katrina");
		lastName.sendKeys("kaief");
		userEmail.sendKeys("jhdhsk@gmail.com");
		userMobile.sendKeys("9156645235");
		
	
		
		Select sel = new Select(chooseYourOccupation);
		
		sel.selectByVisibleText("Engineer");
		
		gender.click();
		
		userPassword.sendKeys("Megha@1234");
		
		confirmPassword.sendKeys("Megha@1234");
		
		checkBox.click();
		
		finalRegisterButton.click();
		
		}
	
	public void clickOnLogin() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		loginButton.click();
		
		
		
	}
}
