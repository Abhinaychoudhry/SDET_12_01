package day12;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	void test()
	{
		int x= 10;
		int y =20;
		
	//	if (x==y)
	//		System.out.println("Test is Passed");
	//	else
	//		System.out.println("Test is Failed");
		
		Assert.assertEquals(x,y);    //hard assertion
	}
	

}
