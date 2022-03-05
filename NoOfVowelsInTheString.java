package week3.day1;

import java.util.Iterator;

public class NoOfVowelsInTheString {

	public static void main(String[] args) {

		int count=0;
		String str="Education";
		String lowerCase = str.toLowerCase();

		for (int i = 0; i < lowerCase.length(); i++) {
			if(lowerCase.charAt(i)=='a'||lowerCase.charAt(i)=='e'||lowerCase.charAt(i)=='i'||
			   lowerCase.charAt(i)=='o'||lowerCase.charAt(i)=='u') {
				count++;
			}
		}System.out.println("No of vowels in the String is  :"+count);
	}
}
