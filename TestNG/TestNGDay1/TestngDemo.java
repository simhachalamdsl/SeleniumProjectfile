package TestNGDay1;

import org.testng.annotations.Test;

public class TestngDemo {

	@Test (priority =1)
	void testfirsttestcase()
	{
		System.out.println("testing1");
	
	}
	
	@Test(priority = 2)
	void testsecondtestcase()
	{
		System.out.println("testing2");
	}
	@Test(priority = 0)
	void testthredtestcase()
	{
		System.out.println("testing3");
	}
	
	
}
