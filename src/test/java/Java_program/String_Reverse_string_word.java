package Java_program;

public class String_Reverse_string_word {
	
	public void reverse(String input)
	{
		//String input = "Hello Java";
		String[] words = input.split(" ");
		String output = " ";
		
		for(String word : words)
		{
			String reverse = " ";
			for(int i = word.length()-1; i >= 0 ; i-- )
			{
				reverse = reverse + word.charAt(i);
			}
			//System.out.println(reverse);
			output = output + reverse;
			
		}
		System.out.println(output);
		
	}
	public static void main(String[] args) 
	{
		String_Reverse_string_word str = new String_Reverse_string_word();
		str.reverse("Amit Amy");
	}

}
