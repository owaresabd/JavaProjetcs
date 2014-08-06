package Encaptulation;


public class Student {
	private int StudentID;
	private String StudentName;
	private String StudentDOB;
	private String Specialization;
	
	public String getSpecialization(){
		return Specialization;
	}
	public void setspecialization(String Specialization){
		this.Specialization = Specialization;
	}
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		this.StudentID = studentID;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		this.StudentName = studentName;
	}
	public String getStudentDOB() {
		return StudentDOB;
	}
	public void setStudentDOB(String studentDOB) {
		this.StudentDOB = studentDOB;
	}
	
	
	
}