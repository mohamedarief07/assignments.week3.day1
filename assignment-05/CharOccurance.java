package week3.day1.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";
	
		// declare and initialize a variable count to store the number of occurrences
		int count = 0;

		// convert the string into char array
		char[] array = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			//System.out.println(array[i]);
			if (array[i] == 'e') {
				count++;

			}
		}

		System.out.println("Number of occurrences of a char 'e' in a String is " + count);

	}
}
