package builder_pattern;

import java.util.Arrays;

import immutable_pattern.Immutable_Animal;

public class BuilderMain {

	public static void main(String[] args) {
		AnimalBuilder animalBuilder = new AnimalBuilder();
		animalBuilder.setAge(4)
		             .setFavouriteFoods(Arrays.asList("grass", "fish"))
		             .setSpecies("duck");
		
		Immutable_Animal duck = animalBuilder.build();
		
		Immutable_Animal lion = animalBuilder.setSpecies("lion")
				                             .setFavouriteFoods(Arrays.asList("deer","zebra"))
				                             .setAge(3).build();
	}

}
