package week3.day1;

public class StringstartsWithT {

	public static void main(String[] args) {


		String str="TestLeaf is located in Teynampet and above the taccobell";
		//String upperCase = str.toUpperCase();
		String[] split = str.split(" ");
		for (int i = 0; i < split.length; i++) {
			if (split[i].startsWith("T")||split[i].startsWith("t")) {

				System.out.println(split[i]);
				
			}
		}

	}



}
