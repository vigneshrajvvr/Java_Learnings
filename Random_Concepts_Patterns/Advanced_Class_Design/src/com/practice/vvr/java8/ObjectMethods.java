package com.practice.vvr.java8;

public class ObjectMethods {
	public static void main(String args[]) {
		// toString()
		Hippo1 h1 = new Hippo1("Harry", 3100);
		System.out.println(h1); //Hippo1 [name=Harry, weight=3100.0]
		
		// equals()
		String s1 = new String("lion");
		String s2 = new String("lion");
		System.out.println(s1.equals(s2));                  // true
		StringBuilder sb1 = new StringBuilder("lion");
		StringBuilder sb2 = new StringBuilder("lion");
		System.out.println(sb1.equals(sb2));                // false
		
		//hashcode
		// if equals method return true for two objects then it hascode method also should 
		// return same value.
		System.out.println("s1 hashcode : " + s1.hashCode() + "s2 hashCode : " + s2.hashCode() + "" + (s1.hashCode() == s2.hashCode()));
	}
}

class Hippo1 {
	private String name;
	private double weight;

	public Hippo1(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * Overriding toString() method of Object class
	 */
	
	@Override
	public String toString() {
		return "Hippo1 [name=" + name + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	

	
//	<dependency>
//    <groupId>commons-lang</groupId>
//    <artifactId>commons-lang</artifactId>
//    <version>2.5</version>
//    </dependency>
	
//	 @Override public String toString() {
//		   return ToStringBuilder.reflectionToString(this,
//		      ToStringStyle.SHORT_PREFIX_STYLE);
//		}
	
//	output: Hippo[name=Harry,weight=3100.0]
	
// --------------------------------------------------------------
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hippo1 other = (Hippo1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}
	
	
}
