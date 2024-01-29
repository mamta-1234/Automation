package rahulsheetytest;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{

@Test(priority = 4)
public void userLogin() {
	
	loginpage.userCredentials();
}

}
