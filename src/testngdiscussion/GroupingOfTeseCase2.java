package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTeseCase2 {
	
	
		
		@Test(groups = {"sanity"})
		public void titleValidation() {
			
			System.out.println("Title teestcase");
		}
		
		@Test(groups = {"functional"})
		public void urlValidation()
		{
			System.out.println("url validation test case");
		}
		
		
		
		

	}



