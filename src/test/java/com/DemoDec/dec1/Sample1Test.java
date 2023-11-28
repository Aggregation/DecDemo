package com.DemoDec.dec1;

import org.testng.annotations.Test;

public class Sample1Test {
	
	@Test(groups = "smoke")
	public void t1()
	{
		System.out.println("-sample1 t1-");
	}
	
	@Test(groups = "regression")
	public void t2()
	{
		System.out.println("-sample1 t11-");
	}

}
