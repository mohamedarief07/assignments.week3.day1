package week3.day1;

public class Assignment3AxisBank extends Assignment3BankInfo {
	
	public void deposit() {
		System.out.println("To test the overriding concept to deposit method - AxisBank");

	}
public static void main(String[] args) {
	Assignment3AxisBank aBank=new Assignment3AxisBank();
	aBank.deposit();
}
}
