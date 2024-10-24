package Java_program;

import java.util.Arrays;

public class StrConverter {

	public static void main(String[] args) {
		String input = "I Am Amit I Am Amit";
		String smallLetter = "";
		String capitalLetter = "";

		int mid = input.length() / 2;
		for(int i=0 ; i<input.length();i++)
		{
			if(i<mid)
			{
				smallLetter = smallLetter + Character.toLowerCase(input.charAt(i));
			}else {
				capitalLetter = capitalLetter + Character.toUpperCase(input.charAt(i));

			}
			
		}
		System.out.print(smallLetter + capitalLetter);
	}
	

}
