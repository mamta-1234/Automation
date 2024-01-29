package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase {
	
	@Test(groups = {"sanity"})
	public void login() {
		
		System.out.println("Login to apllication");
	}
	
	@Test(groups = {"functional","sanity"})
	public void home()
	{
		System.out.println("Home test case");
	}
	
	
	@Test(groups = {"regression","functional"})
	public void profile() {
		System.out.println("Profile test case");
	}
	

	@Test(groups = {"adhoc"})
	public void logout() {
		System.out.println("logout test case");
	}
	

}
