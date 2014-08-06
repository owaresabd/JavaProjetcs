package Encapsulation;

public class StudentDB {
	public static void main(String[] args){
		Student Dave = new Student();
		Dave.setStudentID(1000);
		Dave.setStudentGrade("1st grade");
		Dave.setStudentDOB("01-05-1974");
		
		System.out.println(Dave.getStudentID());
		System.out.println(Dave.getStudentGrade());
		System.out.println(Dave.getStudentDOB());
		
		System.out.println(" "); 
		
		Student alex = new Student();
		alex.setStudentID(1200);
		alex.setStudentGrade("2nd Grade");
		alex.setStudentDOB("12-12-1990");
		
		System.out.println(alex.getStudentID());
		System.out.println(alex.getStudentGrade());
		System.out.println(alex.getStudentDOB());
	}

}
