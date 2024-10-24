package Java_program;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		
		String name = "Amit Agatrao Pratape";
		char[] arr = name.toCharArray();
		char checkStr = 't';
		int cnt =1;
		
		for(int i = 0 ; i< arr.length ; i++)
		{
			if(arr[i] ==  checkStr)
			{	
				arr[i] = String.valueOf(cnt).charAt(0);
				cnt++;
				
			}
		}
		
		System.out.println(arr);
		
	}

}
