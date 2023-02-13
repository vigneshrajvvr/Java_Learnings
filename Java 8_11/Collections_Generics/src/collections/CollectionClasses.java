package collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CollectionClasses {
	
	public static void main(String args[]) {
		Set<Character> letters = Set.of('z','o','a');
		Set<Character> copy = Set.copyOf(letters);
		
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66);   // true
		boolean b2 = set.add(10);   // true
		boolean b3 = set.add(66);   // false
		boolean b4 = set.add(8);   // true
		
		set.forEach(System.out::println);
		
		Queue<Integer> queue = new LinkedList<>();
		System.out.println(queue.offer(10));  // true
		System.out.println(queue.offer(4));   // true
		System.out.println(queue.peek());     // 10
		System.out.println(queue.poll());     // 10
		System.out.println(queue.poll());     // 4
		System.out.println(queue.peek());     // null
		
	}

}
