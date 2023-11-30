package com.DemoDec.dec1;

import org.testng.annotations.Test;

public class Sample3Test {
	
	@Test(groups = "smoke")
	public void sample1()
	{
		System.out.println("---- by jenkins success");
	}
	
	@Test(groups = "smoke")
	public void sample2()
	{
		System.out.println("---jenkins success sample 2");
	}

}
