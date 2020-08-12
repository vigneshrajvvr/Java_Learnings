package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything st.. ");
		cust1.setCashOnHand(25000);
		
		Vehicle vehicle = new Vehicle("Honda","Accord",15000);
				
		Employee emp = new Employee();
		
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW","M3",20000);
		
		Vehicle cloneCar = new Vehicle("BMW","M3",20000);
		
		//equals() method - default implementation compares references
		System.out.println(car.equals(cloneCar));
		
		/*
		 * handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
		 * 	if(finance == true)
		 * 		runCreditHistory(Customer cust, double loanAmount)
		 * 	else if(vehicle.getPrice() <= cust.getCashOnHand())
		 * 		processTransaction(Customer cust, Vehicle vehicle)
		 * 	else
		 * 		tell customer to bring more money
		 */
		
	}

}
