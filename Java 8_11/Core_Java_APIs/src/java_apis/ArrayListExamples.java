package java_apis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExamples {
	
	public static void main(String args[]) {
		
		// Creation
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>(10);
		ArrayList<String> list3 = new ArrayList<>(list2);
		
		var varList = new ArrayList<String>();
		varList.add("TestElement 1");
		
		var varList1 = new ArrayList<>();
		
		System.out.println(list1.add("hawk"));
		list1.add(1, "hawk");
		System.out.println(list1.toString());
		System.out.println(list1.remove("hawk"));
		System.out.println(list1.remove(0));
		list1.add("hawk");
		System.out.println(list1.set(0, "robin"));
		System.out.println(list1.isEmpty() + " " + list1.size());
		System.out.println(list1.contains("robin"));
		list1.clear();
		System.out.println(list1.isEmpty());
		list1.add("hawk");
		System.out.println(list1.equals(list2));
		
		list1.add("hawk");
		list1.add("hawk");
		list1.add("hawk");
		
		//List to array conversion
		Object[] convertedStrings = list1.toArray();
		String[] convertedStrings1 = list1.toArray(new String[0]);
		
		// Array to list conversion
		Integer[] toBeConverted = new Integer[] { 3, 9, 10, 2, 5};
		List<Integer> converted = Arrays.asList(toBeConverted);
		// Fixed size and elements can be changed. Both references point to same object
		
		List<Integer> againConverted = List.of(toBeConverted);
		// Fixed size and elements cannot be changed.
		
		// Ideal way
		List<Integer> finalConversion = new ArrayList<>(againConverted);
		
	}

}
