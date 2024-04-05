package day12;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hard_Soft_assertions {
	
	//@Test
	void hardassertion()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		Assert.assertTrue(false);
		
		System.out.println("This is example of hard assertion");	
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
	}
	
	@Test
	void softassertion()
	{
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		SoftAssert as = new SoftAssert();
		as.assertTrue(false);
		
		System.out.println("This is example of soft assertion");	
		
		as.assertTrue(true);
		as.assertTrue(true);
		as.assertTrue(true);
		
		as.assertAll();
	}

}
