package testngdiscussion;

import org.testng.annotations.Test;

public class IncludeAndExcludeTeseCaseFromClass {

	
	

	@Test
	public void login() {
		
		System.out.println("Login to apllication");
	}
	
	@Test
	public void home()
	{
		System.out.println("Home test case");
	}
	
	
	@Test
	public void profile() {
		System.out.println("Profile test case");
	}
	

	@Test
	public void logout() {
		System.out.println("logout test case");
	}
	
}




