package Assignment2org.student;

import Assignment2org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("studentName from -Student");

	}
	
	public void studentDept() {
		System.out.println("student Dept Code from -Student");

	}
	public void studentId() {
		System.out.println("student ID from-  Student");
		
	
	}
	
public static void main(String[] args) {
	Student std =new Student();
	std.collegeCode();
	std.collegeName();
	std.collegeRank();
	
	std.deptName();
	
	std.studentDept();
	std.studentId();
	std.studentName();
}
}
