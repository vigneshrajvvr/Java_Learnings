package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Applicatoin {
	public static void main(String args[]) {
		HashSet<Integer> list1 = new HashSet<>();
		list1.add(12);
		list1.add(43);
		list1.add(15);
		list1.add(67);
		list1.add(43);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		list1.add(10);
		
		List<Integer> li = new ArrayList<>(list1);
		System.out.println("Converted HashSet into List : "+li);
				
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(10);
		newList.add(67);
		newList.add(15);
		
		Collections.sort(li);
		System.out.println("Sorted and converted HashSet into List : "+li);
		
		ArrayList<String> stringLi = new ArrayList<>();
		stringLi.add("Random");
		stringLi.add("Tooth Brush");
		stringLi.add("Computer");
		stringLi.add("Clothes");
		
		Collections.sort(stringLi);
		System.out.println("Sorted array list of strings : "+ stringLi);
		
		list1.addAll(newList);
		System.out.println(list1);
		
		list1.removeAll(newList);
		System.out.println(list1);
		
		boolean hasValue = list1.contains(43);
		System.out.println("Has Value? "+hasValue);
		
		boolean hasValues= list1.isEmpty();
		System.out.println("Is empty : "+hasValue);
		
		boolean hasValue1 = list1.retainAll(newList);
		System.out.println("Removed elements in the list1 which are not in the newList :"+ hasValue);
		
		list1.clear();
		System.out.println("Empty list : "+list1);
		
		
		//Working with custom classes
		HashSet<Employee> myList = new HashSet<>();
		myList.add(new Employee("Mike", 3500, "Accounting"));
		myList.add(new Employee("Paul", 3000, "Admin"));
		myList.add(new Employee("Peter", 4000, "IT"));
		myList.add(new Employee("Angel",2000, "Maint"));
		
		ArrayList<Employee> myArrayList = new ArrayList<>(myList);
		
		Collections.sort(myArrayList);
		
		System.out.println("Sorting using collections : "+myArrayList);
		
	}
}
