package week3.day1.Assignments;

public class StudentInformation {
	
	public void getStudentInfo(int studentId) {
		System.out.println("Student ID is"+studentId);
	}
	public void getStudentInfo(int studentId, String studentName) {
		System.out.println("Student Id is"+studentId+"Student Name is"+studentName);
	}
	public void getStudentInfo(String studentEmail, float studentMobileNumber) {
		System.out.println("Student Email"+studentEmail+"Student Mobile Number is"+studentMobileNumber);
	}

	public static void main(String[] args) {
		StudentInformation studentInfo = new StudentInformation();
		studentInfo.getStudentInfo(19);
		studentInfo.getStudentInfo(19, "SAT");
		studentInfo.getStudentInfo("test.be", 989408668);
	}

}
