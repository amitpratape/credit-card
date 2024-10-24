package endtoend;
import java.util.*;

import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class array {
	@Test
	public void addition()
	{
		int sum=0;
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
//addition of all array values
		for (int i = 0; i < a.length; i++) {
	
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	}
	
		@Test
		public void reversearray()
		{
			
			int b[]=new int[5];
			b[0]=100;
			b[1]=201;
			b[2]=300;
			b[3]=405;
			b[4]=500;
			for (int i=b.length-1; i >=0; i--) {
				System.out.println(b[i]);
				
			}
			
			//	even and odd numbers
			for (int i = 0; i < b.length; i++) {
				if(b[i]%2==0)
				{
					System.out.println("even number"+b[i]);
				}
				else {
					System.out.println("odd no"+b[i]);
				}
				
			}
		}
		
		@Test 
		public void countnumber() {
			int num=123456789;
			int count= 0;
			while (num != 0) {
			      // num = num/10
			      num /= 10;
			      ++count;
			    }

			    System.out.println("Number of digits: " + count);
			  }
		}
	
		

