package employee.info.system;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 * 
	 **/
	public static void main(String[] args) {
		
		EmployeeInfo jz = new EmployeeInfo(0124);
		EmployeeInfo jc = new EmployeeInfo("John",0124);
		
	System.out.println("your bonus is "+jz.calculateEmployeBonus("Best_performance", 80000));	
	System.out.println("John your pension is:" + jc.calculateEmployePension(80000, 1) );
	System.out.println("John your pension is:" + jc.calculateEmployePension(80000, 2) );
	System.out.println("John your pension is:" + jc.calculateEmployePension(80000, 3) );	
	jc.benefitLayout();	
		
	}

}