package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Application {
	public static void main(String args[]) {

		// HashMap usage - will not preserve order
		HashMap<String, String> dictionary = new HashMap<>();
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confident", "feeling or showing confidence in oneself or one's abilities or qualities.");
		
		//Overrides the value as the key is already present
		dictionary.put("Brilliant", "xxxxxxxxxx");

		System.out.println("HashMap example: ");
		for (String word : dictionary.keySet()) {
			System.out.println(word);
		}
		
		for(Map.Entry<String,String> temp : dictionary.entrySet()) {
			System.out.println(temp.getKey() + " - "+ temp.getValue());
		}

		// LinkedHashMap usage - preserves order
		LinkedHashMap<String, String> linkedDictionary = new LinkedHashMap<>();
		linkedDictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		linkedDictionary.put("Brilliant", "exceptionally clever or talented.");
		linkedDictionary.put("Joy", "a feeling of great pleasure and happiness.");
		linkedDictionary.put("Confident", "feeling or showing confidence in oneself or one's abilities or qualities.");

		System.out.println("\nLinkedHashMap example: ");
		for (String word : linkedDictionary.keySet()) {
			System.out.println(word + " - "+linkedDictionary.get(word));
		}
		
		//Treemap - Stores in sorted order
		HashMap<String, String> treeDictionary = new HashMap<>();
		treeDictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		treeDictionary.put("Brilliant", "exceptionally clever or talented.");
		treeDictionary.put("Joy", "a feeling of great pleasure and happiness.");
		treeDictionary.put("Confident", "feeling or showing confidence in oneself or one's abilities or qualities.");
		
		System.out.println("\nTreeMap");
		for(Map.Entry<String,String> temp : treeDictionary.entrySet()) {
			System.out.println(temp.getKey() + " - "+ temp.getValue());
		}

	}
}
