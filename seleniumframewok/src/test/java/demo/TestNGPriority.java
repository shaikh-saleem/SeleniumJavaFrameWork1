package demo;

import org.testng.annotations.Test;

public class TestNGPriority {
	@Test(priority = 3)
	public void test1()
	{
		System.out.println("Inside test1");
	}
	@Test(priority = 2)
	public void test2()
	{
		System.out.println("Inside test2");
	}
	@Test(priority = 0)
	public void test3()
	{
		System.out.println("Inside test3");
	}
	

}
