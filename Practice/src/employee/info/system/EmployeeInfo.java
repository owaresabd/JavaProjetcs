package employee.info.system;

public class EmployeeInfo extends BasicEmployee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 */

	/*
	 * declare few static and final fields and some non-static fields
	 * 
	 */
	 static String companyName = "CNN";
	 final static int EMPLOYEE_STANDARD_WORK_HOURS = 40;
	 private int empId; 
	 private String empName;
	// Performance performance;
	 private static String performance = "";
	 private static int salary = 0;
	 private static int yearsEmployed;
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		super.setCountry("Canada");
		this.empId = employeeId;
		
		//this.performance = 
		
	}
    public EmployeeInfo(String name, int employeeId){
    	this.empId = employeeId;
    	this.empName=name;
    	
	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeBonus(String perf, int sal ){
		int total=0;
		salary = sal;
		performance = perf;
		
		if(performance=="Best_performance"){
			total = (salary* 10)/100;	
		}
		if (performance=="Average_performance"){
			total = (salary* 8)/100;
		}
		
		return total;
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployePension(int sal, int yrs){
		int total=0;
		salary = sal;
		if(yrs>1){
			total= (sal *10)/100;
			}
		else{
			total= (sal *5)/100;
		}
		return total;
	}
	

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int sal) {
		salary = sal;
	}
	
	/**
	 * @return the performance
	 */
	public String getPerformance() {
		return performance;
	}
	/**
	 * @param performance the performance to set
	 */
	public void setPerformance(String p) {
		this.performance = p;
	}
	
//	/**
//	 * @return the performance
//	 */
//	public Performance getPerformance() {
//		return performance;
//	}
//	/**
//	 * @param performance the performance to set
//	 */
//	public void setPerformance(Performance p) {
//		this.performance = p;
//	}
	@Override
	public int employeeId() {
		
		return empId;
	}
	@Override
	public String employeeName() {
		
		return empName;
	}
	@Override
	public void assignDepartment() {
		System.out.println("currently unassigned");
		
	}
	@Override
	public int calculateSalary() {
		salary = 40*65*52;
		return salary;
	}
	@Override
	public void benefitLayout() {
		System.out.println("currently unassigned");
		
	}
	@Override
	public boolean isVested(int numberOfYrsEmployed) {
		
		return false;
	}
	@Override
	public boolean isEnrolledInRetirementPlan() {
		
		return false;
	}
	@Override
	public String jobTitle() {
		
		return "employee";
	}
}