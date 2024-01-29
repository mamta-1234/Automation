package rahulsheetytest;

import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{
	
	@Test(priority= 1)
	public void clickOnRegister() {
		
		registerpage.clickOnRegister();
	}
	
	@Test(priority = 2)
	public void fillingUserDetails() {
		
		registerpage.userDetails();
	}
	
	@Test(priority = 3)
	public void clickOnLogin() {
		
		registerpage.clickOnLogin();
	}
	

}
