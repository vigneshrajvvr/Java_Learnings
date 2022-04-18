package lesson2;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String args[]) {
		List<String> animals = new ArrayList<>();
		animals.add("Lion");
		animals.add("Cat");
		animals.add("Dog");
		
//		Traversing ArrayList
//		for(int i=0;i < animals.size();i++) {
//			System.out.println(animals.get(i));
//		}
//		
//		for(String value : animals) {
//			System.out.println(value);
//		}
		
		List<Vehicle> vehicle = new ArrayList<>();
		
		Vehicle vehicle2 = new Vehicle("Toyota", "camery", 12000, false);
		
		vehicle.add(new Vehicle("Honda", "Accord", 12000, false));
		vehicle.add(vehicle2);
		
		Vehicle vehicle3 = new Vehicle("Jeep", "Wrangler", 25000, true);
		vehicle.add(vehicle3);
		
//		for(Vehicle car : vehicle) {
//			System.out.println(car);
//		}
		
		printElements(vehicle);
		printElements(animals);
	}
	
	public static void printElements(List someList) {
		for(int i=0;i < someList.size();i++) {
			System.out.println(someList.get(i));
		}
	}
	
}
