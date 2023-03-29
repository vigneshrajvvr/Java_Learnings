package functional_programming;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BuiltInInterfaces {
	
	public static void main(String args[]) {
		
		/*
		 * Supplier Interface
		 */
		
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();
		
		System.out.println(d1); // 2023-03-28
		System.out.println(d2); // 2023-03-28
		
		Supplier<StringBuilder> s3 = StringBuilder::new;
		Supplier<StringBuilder> s4 = () -> new StringBuilder();
		
		System.out.println(s3); // functional_programming.BuiltInInterfaces$$Lambda$3/0x0000000800001800@3ab39c39
		System.out.println(s4); // functional_programming.BuiltInInterfaces$$Lambda$3/0x0000000800001800@3ab39c39
		
		// functional_programming is the interface name
		// BuiltInInterfaces is the class name
		// $$ means class doesn't exist in the class file on the file system
		
		/*
		 * Cosumer and BiConsumer Interfaces
		 */
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = (x) -> System.out.println(x);
		c1.accept("Annie"); // Annie
		c2.accept("Annie"); // Annie	
		
		var map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> c3 = map::put;
		BiConsumer<String, Integer> c4 = (k, v) -> map.put(k, v);
		c3.accept("Chicken", 7);
		c3.accept("Chick", 1);
		System.out.println(map); // {Chicken=7, Chick=1}
		

		/*
		 * Predicate and BiPredicate Interfaces
		 */
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = (str) -> str.isEmpty();
		System.out.println(p1.test("")); // true
		System.out.println(p2.test("Hello")); // false
		
		BiPredicate<String, String> p3 = String::startsWith;
		BiPredicate<String, String> p4 = (string, prefix) -> string.startsWith(prefix);
		System.out.println(p3.test("Hello", "He"));   // true
		System.out.println(p4.test("Chicken", "chick")); // false
		
		/*
		 * Function and BiFunction Interfaces
		 */
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = (str) -> str.length();
		System.out.println(f1.apply("Test")); // 4
		System.out.println(f2.apply("function")); // 8
		
		BiFunction<String, String, Integer> f3 = String::indexOf;
		BiFunction<String, String, Integer> f4 = (str1, str2) -> str1.indexOf(str2);
		System.out.println(f3.apply("Test", "es")); // 1
		System.out.println(f4.apply("function", "ab")); // -1
		
		/*
		 * UnaryOperator and BinaryOperator Interfaces
		 */
		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = (str) -> str.toUpperCase();
		System.out.println(u1.apply("Test")); // TEST
		System.out.println(u2.apply("function")); // FUNCTION
		
		BinaryOperator<String> b1 = String::concat;
		BinaryOperator<String> b2 = (str1, str2) -> str1.concat(str2);
		System.out.println(b1.apply("Test", "es")); // Testes
		System.out.println(b2.apply("function", "ab")); // functionab
		
		/*
		 * Default methods in functional interfaces
		 * 
		 */
			/*
			 * Predicate Interface
			 */
			Predicate<String> egg = s -> s.contains("egg");
			Predicate<String> brown = s -> s.contains("brown");
			
			Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
			Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
			
			brownEggs = egg.and(brown);
			otherEggs = egg.and(brown.negate());
			
			System.out.println(brownEggs.test("egg - brown")); // true
			System.out.println(brownEggs.test("egg - white")); // false
		
		/*
		 * Consumer Interface
		 */
		Consumer<String> c11 = x -> System.out.println("1: " + x);
		Consumer<String> c12 = x -> System.out.println("2: " + x);
		
		Consumer<String> combined = c11.andThen(c12);
		combined.accept("Annie"); // 1: Annie  2: Annie
		// Same input is being passed for both the consumer interfaces
		
		
	}
	

}
