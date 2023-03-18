package week3.day1.Assignments;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Student Name from student class");
	}
	public void studentDept() {
		System.out.println("Student Dept from Student class");
	}
	public void studentID() {
		System.out.println("Student ID from Student class");
	}

	public static void main(String[] args) {
	
		Student student = new Student();
		student.studentName();
		student.studentDept();
		student.studentID();
		student.getDeptName();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
	}

}
