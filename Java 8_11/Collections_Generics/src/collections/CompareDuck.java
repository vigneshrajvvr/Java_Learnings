package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CompareDuck implements Comparable<CompareDuck>{
	
	private String name;
	private int weight;
	private String species;
	
	public CompareDuck(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(CompareDuck duck) {
		return this.name.compareTo(duck.name);
	}
	
	public String toString() {
		return this.name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public static void main(String args[]) {
		
		Comparator<CompareDuck> byWeight = new Comparator<>() {
			public int compare(CompareDuck d1, CompareDuck d2) {
				return d1.getWeight() - d2.getWeight();
			}
		};
		
		Comparator<CompareDuck> byWeightLamda = (d1, d2) -> d1.getWeight() - d2.getWeight();
		Comparator<CompareDuck> byWeightRef = Comparator.comparing(CompareDuck::getWeight);
		Comparator<CompareDuck> byWeightRefChaining = Comparator.comparing(CompareDuck::getWeight).reversed();
		Comparator<CompareDuck> byWeightRefChaining1 = Comparator.comparing(CompareDuck::getSpecies).thenComparing(CompareDuck::getWeight);
		
		var ducks = new ArrayList<CompareDuck>();
		ducks.add(new CompareDuck("Quack", 7));
		ducks.add(new CompareDuck("Puddles", 10));
		Collections.sort(ducks);
		System.out.println(ducks); // [Puddles, Quack]
		Collections.sort(ducks, byWeight);
		System.out.println(ducks); // [Quack, Puddles]


	}

}
