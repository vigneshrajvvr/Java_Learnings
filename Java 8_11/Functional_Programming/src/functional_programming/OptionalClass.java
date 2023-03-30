package functional_programming;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptionalClass {
	
	public static void main(String args[]) throws Exception {
		
		Optional<Double> optional = average(10,20);
		Optional<Double> optionalEmpty = average();
		Consumer<Double> printStatement = System.out::println;
		Supplier<Double> returnStatement = () -> 5.0;
		Supplier<Exception> returnException = () -> new Exception();
		System.out.println(average(90, 100)); // Optional[95.0]
		System.out.println(average()); // Optional.empty
		System.out.println(optional.get()); // 15.0
		optional.ifPresent(printStatement); // 15.0
		System.out.println(optionalEmpty.orElse(10.5)); // 10.5
		System.out.println(optionalEmpty.isPresent()); // false
		System.out.println(optionalEmpty.orElseGet(returnStatement)); // 5.0
		System.out.println(optionalEmpty.orElseThrow()); // NoSuchElementException
		System.out.println(optionalEmpty.orElseThrow(returnException)); // Exception thrown as per mentioned in the Supplier implementation
		
	}

	public static Optional<Double> average(int... scores) {
		
		if(scores.length == 0) {
			return Optional.empty();
		}
		
		int sum = 0;
		for(int score: scores) {
			sum += score;
		}
		
		return Optional.of((double)sum / scores.length);
	}
}
