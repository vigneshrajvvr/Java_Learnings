package immutable_pattern;

import java.util.List;

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

public final class Immutable_Animal {
	
	private final String species;
	
	private final int age;
	
	private final List<String> favouriteFoods;

	public Immutable_Animal(String species, int age, List<String> favouriteFoods) {
		super();
		this.species = species;
		this.age = age;
		this.favouriteFoods = favouriteFoods;
	}

	public String getSpecies() {
		return species;
	}

	public int getAge() {
		return age;
	}
	
	public int getFavouriteFoodsCount() {
		return favouriteFoods.size();
	}
	
	public String getFavoriteFood(int index) {
	    return favouriteFoods.get(index);
	}

}
