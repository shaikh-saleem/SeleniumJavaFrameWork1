package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {

	@Test
	@Parameters("myName")
	public void test1(@Optional("Raqeebu") String name)
	{
		System.out.println("Name:"+name);
	}
}
