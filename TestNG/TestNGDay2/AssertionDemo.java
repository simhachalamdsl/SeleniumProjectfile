package TestNGDay2;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	String a ="Simha";
	String b ="Chalam";
	String c= "Chalam";
	
	@Test(priority =1)
	void ab()
	{
	Assert.assertEquals(a,b);
	
	}
	@Test(priority =2)
	void bc()
	{
	 Assert.assertEquals(b,c);
	}
	
	@Test(priority =3)
	void bca()
	{
	 Assert.assertTrue(b==c);
	}
	@Test(priority =4)
	void abc()
	{
	 Assert.assertFalse(a==c);
	}

}
