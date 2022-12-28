package concurrency;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class CocurrentCollections {
	
	public static void main(String args[]) {
		// If we use normal HashMap then it will throw ConcurrentModificationExecption
		var foodData = new ConcurrentHashMap<String, Integer>();
		foodData.put("penguin", 1);
		foodData.put("flamingo", 2);
		for(String key : foodData.keySet()) {
			System.out.println("Removing : " + key);
			foodData.remove(key);
		}
		
		Queue<Integer> queue = new ConcurrentLinkedQueue<>();
		queue.offer(31);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		
		// Concurrent version of TreeSet
		Set<String> gardenAnimals = new ConcurrentSkipListSet<>();
		gardenAnimals.add("rabbit");
		gardenAnimals.add("gopher");
		System.out.println(gardenAnimals.stream().collect(Collectors.joining(",")));
		
		// Concurrent version of TreeMap
		Map<String, String> rainForestAnimalDiet = new ConcurrentSkipListMap<>();
		rainForestAnimalDiet.put("koala", "bamboo");
		rainForestAnimalDiet.entrySet()
			.stream()
			.forEach((e) -> System.out.println(e.getKey() + "-" + e.getValue()));
		
		List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4,3,42));
		for(var n: favNumbers) {
			System.out.println(n + " ");
			favNumbers.add(9);
		}
		System.out.println();
		System.out.println("Size: " + favNumbers.size());
		
		Set<Character> favSetNumbers = new CopyOnWriteArraySet<>(List.of('a','t'));
		for(var n: favSetNumbers) {
			System.out.println(n + " ");
			favSetNumbers.add('s');
		}
		System.out.println();
		System.out.println("Size: " + favSetNumbers.size());
		
		try {
			var blockingQueue = new LinkedBlockingQueue<Integer>();
			blockingQueue.offer(32);
			blockingQueue.offer(3,4,TimeUnit.SECONDS);
			System.out.println(blockingQueue.poll());
			System.out.println(blockingQueue.poll(10, TimeUnit.SECONDS));
		} catch(InterruptedException e) {
			// Handle interruption
		}
	}

}
