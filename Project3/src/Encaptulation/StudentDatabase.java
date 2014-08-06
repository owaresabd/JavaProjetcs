package Encaptulation;

public class StudentDatabase {

	public static void main(String[] args){
		
		Student st1 = new Student();
		st1.setStudentID(1000);
		st1.setStudentName("Dave Heffner");
		st1.setStudentDOB("09-23-1970");
		st1.setspecialization("Accounting");
		//Print to console
		System.out.println(st1.getStudentID());
		System.out.println(st1.getStudentName());
		System.out.println(st1.getStudentDOB());
		System.out.println(st1.getSpecialization());
		
	
	}
	
}
