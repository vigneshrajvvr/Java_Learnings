package functional_programming;

import java.util.List;
import java.util.stream.Stream;

public class StreamFunctionality {
	
	public static void main(String args[]) {
		
		Stream<String> empty = Stream.empty();
		Stream<Integer> singleElement = Stream.of(1);
		Stream<Integer> fromArray = Stream.of(1, 2, 3);
		
		var list = List.of("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		
	}

}
