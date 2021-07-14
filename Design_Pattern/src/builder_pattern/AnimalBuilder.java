package builder_pattern;

import java.util.List;

import immutable_pattern.Immutable_Animal;

/*
 * Immutable pattern let us to create an object which is non modifiable
 * once assigned.
 * 
 * Class, attributes and methods are marked as final so that no class can
 * extend or override and make the object mutable
 * 
 * Never return reference of the immutable object which contains references
 * of mutable object
 * 
 * Only getters should be used to make sure fields cannot be modified.
 */

public final class AnimalBuilder {
	
	private String species;
	
	private int age;
	
	private List<String> favouriteFoods;

	public AnimalBuilder setSpecies(String species) {
		this.species = species;
		return this;
	}

	public AnimalBuilder setAge(int age) {
		this.age = age;
		return this;
	}

	public AnimalBuilder setFavouriteFoods(List<String> favouriteFoods) {
		this.favouriteFoods = favouriteFoods;
		return this;
	}
	
	public Immutable_Animal build() {
		return new Immutable_Animal(species, age, favouriteFoods);
	}

}
