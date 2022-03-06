package week3.day1;

public class Assignment4Students {
	
	public void getStudentInfo(int id1, int id2) {
	System.out.println(id1+"," +id2);	

	}

	public void getStudentInfo(int id3, String str) {
		System.out.println(id3+ "," +str);
		
	}

				
		public void getStudentInfo(String email, long number1) {
			System.out.println(email+ ","+number1);	

		}
		
		public static void main(String[] args) {
			Assignment4Students wrk=new Assignment4Students();
			wrk.getStudentInfo(31, 42);
			wrk.getStudentInfo(43, "Ramu");
			wrk.getStudentInfo("test@test.com", 9789883880L);
		}
		
}
