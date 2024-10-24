package Java_program;

import java.util.HashSet;
import java.util.Set;

public class Remove_duplicate_char {
	
	public void Approch1(String input)
	{
		Set<String> origonal = new HashSet<String>();
		char[] remove = input.toCharArray();
		
		for(int i = 0 ; i < remove.length ; i++)
		{
			//String s = Arrays.toString(remove);
			//origonal.append(remove[i]);
			String e =  Character.toString(remove[i]);
			origonal.add(e);
			
		}	
		System.out.println(origonal);
		
		
	}
	
	public void Approch2(String input)
	{
		StringBuilder sb = new StringBuilder();
		
		char[] demo_Array = input.toCharArray();
		for(int i = 0 ; i < demo_Array.length ; i++ ) 
		{
			boolean repeated = false;
			
			for(int j = i+1 ; j <demo_Array.length ; j++)
			{
				if(demo_Array[i]==demo_Array[j])
				{
					repeated = true;
					break;
				}
			}
				if(!repeated) 
				{
					sb.append(demo_Array[i]);
				}
				
		}
		System.out.println(sb.toString());


	}
	
	

	public static void main(String[] args) {
		Remove_duplicate_char rv = new Remove_duplicate_char();
		rv.Approch2("Programming");
	}

}
