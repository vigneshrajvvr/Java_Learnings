import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
	public static void main(String args[]) {
		ArrayList<String> words = new ArrayList<>();
		words.add("hello");
		words.add("there");
		words.add("10");
//		words.add(9);
//		words.add(12.00);
//		words.add('H');
//		
		String item1 = words.get(2);
//		Object item2 = words.get(3);
		System.out.println(item1);

		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(45);
		numbers.add(2000);
		numbers.removeFirst();
		
		for(int number : numbers) {
			 System.out.println(number);
		}

	}
}
