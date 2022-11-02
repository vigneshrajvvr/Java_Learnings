package singleResponsibilityPrinciple;

public class TaxCalculator {
	
	public void calculate(Employee employee) {
		if(employee.getEmployeeType().equals("FULLTIME")) {
			//Tax calculation for full time employee
		} 
		if(employee.getEmployeeType().equals("CONTRACT")) {
			//Tax calculation for contract employee
		}
	}
	

}
