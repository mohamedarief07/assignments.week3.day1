package week3.day1.assignments;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String text1 = "stops";
		String text2 = "potss";
		
		int text1length = text1.length();
		int text2length = text2.length();
		
		if(text1length==text2length) {
			//System.out.println("length of the strings are same");
			char[] arraytext1=text1.toCharArray();
			for (int i = 0; i < text1length; i++) {
				System.out.println(arraytext1[i]);
			}
			System.out.println("====================");
			char[] arraytext2=text2.toCharArray();
			for (int i = 0; i < text1length; i++) {
				System.out.println(arraytext2[i]);
			}
			System.out.println("====================");
			Arrays.sort(arraytext1);
			System.out.println(arraytext1);
			Arrays.sort(arraytext2);
			
			System.out.println(arraytext2);
			
			System.out.println("====================");
				
			if(Arrays.equals(arraytext1,arraytext2)) {
				System.out.println("Given two strings are Anagram");
			}
			else {
				System.out.println("two strings are NOT Anagram");
			}
			
		}
			 else { System.out.println("Length of the strings are same. SO two strings are NOT Anagram"); }
			 
	
		
	}
}
