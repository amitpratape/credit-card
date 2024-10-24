package endtoend;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	@Test
	@Parameters({"i","j"})
	public void add(int a, int b) 
	{
		System.out.println("additio of two number " +a+b);
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub(int a, int b) 
	{
		System.out.println( "sub of two no "+ (a-b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void multi(int a, int b) 
	{
		System.out.println("additio of two number" +a*b);
	}
}
