package functional_programming;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFunctionality {
	
	public static void main(String args[]) {
		
		/*
		 * Stream Creation
		 */
		
		Stream<String> empty = Stream.empty();
		Stream<Integer> singleElement = Stream.of(1);
		Stream<Integer> fromArray = Stream.of(1, 2, 3);
		
		var list = List.of("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		
		/*
		 * Terminal Operations
		 */
		
		// count
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		System.out.println(s.count()); // 3
		
		// min 
		Stream<String> sMin = Stream.of("monkey", "ape", "bonobo");
		Optional<String> min = sMin.min((s1, s2) -> s1.length() - s2.length());
		System.out.println(min.isPresent()); // true
		System.out.println(min.get()); // ape
		
		// max
		Stream<String> smax = Stream.of("monkey", "ape", "bonobo");		
		Optional<String> max = smax.max((s1, s2) -> s1.length() - s2.length());
		System.out.println(max.isPresent()); // true
		System.out.println(max.get()); // monkey
		
		Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
		System.out.println(minEmpty.isPresent()); // false
		
	}

}
