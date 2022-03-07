package week3.day1.assignments;

public class Palindrome {
	
	public static void main(String[] args) {

		String str="madam";
		String reverse="";
		int length = str.length();
		
		for (int i = str.length()-1; i >=0; i--) {
			
			reverse=reverse+str.charAt(i);
		
		}
		if(str.equals(reverse))
			
			System.out.println("palindrome");
		
		else
		
			System.out.println("not palindrome");
		
		 
	}
	
	}


