
public class Zoo {

	public static void main(String[] args) {
		
//   	Can't be instantiated as it's an abstract class
//		Animal animal1 = new Animal(12, "M", 23);
//		animal1.eat();
		
		Bird bird1 = new Bird(3,"F",10);
		bird1.eat();
		bird1.sleep(); 
		
		Chicken chick1 = new Chicken(1,"M",7);
		//chick1.fly(); fly() method not visible to chicken object
		
		Sparrow sparrow1 = new Sparrow(2,"F",24);
		sparrow1.fly();
		sparrow1.move();
		
		//Visibility is restricted to reference variable type
		Animal sparrow2 = new Sparrow(3,"F",14);
		sparrow2.move();
		
		Fish fish1 = new Fish(1,"M",2);
		fish1.move();
		
		moveAnimal(fish1);
		moveAnimal(sparrow1);
		
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
