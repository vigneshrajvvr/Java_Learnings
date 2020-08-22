package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {
	public static void main(String args[]) {

		// It will not allow duplicates
		// It will not preserve order
		HashSet<String> values = new HashSet<>();
		values.add("Random1");
		values.add("Random2");
		values.add("Random3");
		values.add("Random4");
		values.add("Random5");
		System.out.println("HashSet:");
		for (String value : values) {
			System.out.println(value);
		}

		// It will not allow duplicates
		// It will preserve order
		LinkedHashSet<String> values1 = new LinkedHashSet<>();
		values.add("Random1");
		values.add("Random2");
		values.add("Random3");
		values.add("Random4");
		values.add("Random5");

		System.out.println("LinkedHashSet:");
		for (String value : values) {
			System.out.println(value);
		}
		
		//User define type Animal
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 8);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangroo", 24);
		
		HashSet<Animal> animals = new HashSet<>();
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal4);
		animals.add(animal5);
		
		System.out.println(animal1.equals(animal4));
		System.out.println(animal1.equals(animal5));
		
		System.out.println("Animals:");
		for (Animal animal : animals) {
			System.out.println(animal);
		}

	}
}
