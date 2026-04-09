package TestNGDay1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemo2 {

	@Test
	void testfirsttestcase()
	{
		System.out.println("testing1");
	
	}
	
	@BeforeMethod
	void testsecondtestcase()
	{
		System.out.println("testing2");
	}
	
	
	
}
