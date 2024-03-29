package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiFunction;

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
		
		Map<String, String> map = Map.of("Test1", "Value1", "Test2", "Value2");
		map = Map.ofEntries(
				Map.entry("Test1", "Value1"),
				Map.entry("Test2", "Value2"));
		Map<String, String> copiedMap = Map.copyOf(map);
		
		//HashMap
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("koala", "bamboo");
		hashMap.put("lion", "meat");
		hashMap.put("girafee", "leaf");
		String food = hashMap.get("koala");  // bamboo
		for(String key : hashMap.keySet()) {
			System.out.println(key + ","); // koala, lion, girafee
		}
		
		//TreeMap
		Map<String, String> treeMap = new HashMap<>();
		treeMap.put("koala", "bamboo");
		treeMap.put("lion", "meat");
		treeMap.put("girafee", "leaf");
		String treeFood = treeMap.get("koala");  // bamboo
		for(String key : treeMap.keySet()) {
			System.out.println(key + ","); // girafee, koala, lion, 
		}
		
		System.out.println(treeMap.containsKey("lion"));   // true
		System.out.println(treeMap.containsValue("meat")); // true
		System.out.println(treeMap.size());                // 3
		treeMap.clear();   
		System.out.println(treeMap.size());                // 0
		System.out.println(treeMap.isEmpty());             // true
		
		Map<Integer, Character> newMap = new HashMap<>();
		newMap.put(1, 'a');
		newMap.put(2, 'b');
		newMap.put(3, 'c');
		
		newMap.forEach((k, v) -> System.out.println(v));
		newMap.values().forEach(v -> System.out.println(v));
		newMap.values().forEach(System.out::println);
		newMap.entrySet().forEach(System.out::println);
		newMap.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		newMap.keySet().forEach(System.out::println);
		
		System.out.println(newMap.getOrDefault(1, 's'));  // a
		System.out.println(newMap.getOrDefault(0, 's'));  // s
		System.out.println(newMap.replace(3, 'd'));       // c
		System.out.println(newMap.replace(4, 'd'));       // null
		newMap.forEach((k, v) -> System.out.println(v)); // a b d
		
		newMap.replaceAll((k, v) -> 'a');
		newMap.forEach((k, v) -> System.out.println(v)); // a a a
		
		Map<String, String> favorites = new HashMap<>();
		favorites.put("Jenny", "Tram");
		favorites.putIfAbsent("Jenny", "Replaced");
		favorites.forEach((k, v) -> System.out.println(v)); // Tram	

		favorites.put("Tom", null);
		favorites.putIfAbsent("test", "Replaced");
		favorites.forEach((k, v) -> System.out.println(v)); // Replaced
		
		Map<String, String> merge = new HashMap<>();
		merge.put("Jenny", "Bus Tour");
		merge.put("Tom", "Tram");
		
		BiFunction<String, String, String> merger = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		merge.merge("Jenny", "New Bus Tour", merger); 
		merge.forEach((k, v) -> System.out.println(k + " : " + v)); // ["Jenny" : "New Bus Tour", "Tom", "Tram"]
		
		merge.merge("Tennis", "New Bus Tour", merger); 
		merge.forEach((k, v) -> System.out.println(k + " : " + v)); // ["Jenny" : "New Bus Tour", "Tom", "Tram", "Tennis" : "New Bus Tour"]
	
		
		Map<String, String> mergeNew = new HashMap<>();
		mergeNew.put("Jenny", "Bus Tour");
		mergeNew.put("Tom", "Tram");
		
		BiFunction<String, String, String> mergerNew = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
		mergeNew.merge(null, "New Bus Tour", mergerNew); 
		mergeNew.forEach((k, v) -> System.out.println(k + " : " + v)); // [null : "New Bus Tour", "Jenny" : "New Bus Tour", "Tom", "Tram"]
		
		Map<String, String> mergeNull = new HashMap<>();
		mergeNull.put("Jenny", "Bus Tour");
		mergeNull.put("Tom", "Tram");
		
		BiFunction<String, String, String> mergerNull = (v1, v2) -> null;
		mergeNull.merge("Jenny", "New Bus Tour", mergerNull); 
		mergeNull.forEach((k, v) -> System.out.println(k + " : " + v)); // ["Tom", "Tram"]
		
		
		
	}

}
