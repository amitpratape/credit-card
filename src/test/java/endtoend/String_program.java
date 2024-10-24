package endtoend;

public class String_program 
{
	String Sentence = "You Can Read More About Exceptions 12354";
	char[] array    =  Sentence.toCharArray();
	public static int count_Alphabetic = 0;
	public static int count_Numeric = 0;
	public static int count_Space = 0;
	public static int count_Uppercase = 0;
	public static int count_Lowercase = 0;
	public static char valueOf;
	
	public void count_Character()
	{
		for(int i=0;i<array.length;i++)
		{
			if(Character.isAlphabetic(array[i]))
			{	
				count_Alphabetic++;
			}
			
			if(Character.isDigit(array[i]))
			{	
				count_Numeric++;
			}
			
			if(Character.isSpace(array[i]))
			{	
				count_Space++;
			}
			
			if(Character.isUpperCase(array[i]))
			{	
				count_Uppercase++;
			}
			
			if(Character.isLowerCase(array[i]))
			{	
				count_Lowercase++;
			}
			
			
		}
		
		System.out.println("count of alphabetical no is " +count_Alphabetic);
		System.out.println("count of numeric no is " +count_Numeric);
		System.out.println("count of space no is " +count_Space);
		System.out.println("count of Uppercase  " +count_Uppercase);
		System.out.println("count of Lowercase  " +count_Lowercase);


	}
	


	public static void main(String[] args) 
	{
		String_program sp = new String_program();
		sp.count_Character();
	}

}
