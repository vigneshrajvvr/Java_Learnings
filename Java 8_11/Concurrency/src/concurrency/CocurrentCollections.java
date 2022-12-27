package concurrency;

import java.util.concurrent.ConcurrentHashMap;

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
	}

}
