package testngdiscussion;

import org.testng.annotations.Test;

public class ExecutingClassesInParallel1 {

	
	
	@Test
	public void testCase1() {
		
		System.out.println("TestCase 1");
	}
	
	
	@Test
	public void testCase2() {
		
		System.out.println("TestCase 2");
}

	@Test
	public void testCase3() {
		
		System.out.println("TestCase 3");
		
	}
}
