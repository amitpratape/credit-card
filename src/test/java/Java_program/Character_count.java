package Java_program;

import java.util.HashMap;
import java.util.Map;

public class Character_count {

	public static void main(String[] args) {

		String input = "hello";

		char[] array_input = input.toCharArray();
		Map<Character, Integer> output_array = new HashMap<>();

		for (char ch : array_input) {
			if (!output_array.containsKey(ch)) {
				output_array.put(ch, 1);
			} else {
				int value = output_array.get(ch);
				output_array.put(ch, value + 1);
			}
		}

		System.out.println(output_array);

	}
}
