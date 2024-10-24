package endtoend;

import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Scanner_class {
		
	Scanner sc = new Scanner(System.in);
	
	@Test(enabled = false)
	public void accept_No() {
		System.out.println("enter the size of array");
		int no = sc.nextInt();
		String[]	list_of_no = new String[no];
		for(int i=0;i<list_of_no.length;i++)
		{
			//list_of_no[i] = sc.nextInt();
			list_of_no[i]	= sc.nextLine();
			
			
		}
		System.out.println(Arrays.toString(list_of_no));
	}
	
	@Test(enabled=false)
	public void reverse() {
		int j=0;
		int[] array1 ={12,78,52,45,65,78};
		int[] reverse_array = new int[array1.length];
		
		for(int i = array1.length-1; i>=0 ; i--)
		{	
			reverse_array[j] = array1[i];
			j++;
		}
		System.out.println(Arrays.toString(reverse_array));

		
		
	}
	
	@Test(enabled=true)
	public void sort()
	{
		int[] array1 ={90,80,70,60,50,40};
		int temp= 0;
		
		for(int i=0;i<=array1.length-1 ;i++)
		{
			for(int j = i+1 ; j<=array1.length-1; j++)
			{
				if(array1[i] > array1[j] ) 
				{
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
					
				}
			}			
			
			//System.out.println(Arrays.toString(array1));
		}
		
		
		
	}
	@Test
	public void display_array() 
	{	
		int[] array2 ={90,80,70,60,50,40};

		for(int i=0;i<array2.length;i++)
		{
			System.out.println(array2[i]);
		}
	}

}