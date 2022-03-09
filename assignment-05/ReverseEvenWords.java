package week3.day1.assignments;


public class ReverseEvenWords {
	
	public static void main(String[] args) {
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
		//Declare the input as Follow
		String test = "I am a software tester"; 
		

		System.out.println(test);
		
		//split the words and have it in an array
		String[] StringArray = test.split(" ");	
		for(int i=0;i<StringArray.length;i++)
			
		 {
			if(i%2!=0)
			{
				char[] charArray = StringArray[i].toCharArray();
						for (int j=charArray.length-1;j>=0; j--) {
					System.out.print(charArray[j]);
				}
			}else
			{
				System.out.print(" "+StringArray[i]+" "); //0
			}
	
		 }
		
	}

}
