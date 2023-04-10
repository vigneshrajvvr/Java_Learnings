package functional_programming;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.function.BooleanSupplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
	
	public static void main(String args[]) {
		
		/*
		 * Primitive Stream Creation
		 */
		// Finite Streams
		System.out.println("Finite Streams :");
		IntStream intStream = IntStream.empty();
		LongStream longStream = LongStream.empty();
		DoubleStream doubleStream = DoubleStream.empty();
		DoubleStream oneValue = DoubleStream.of(3.14);
		oneValue.forEach(System.out::print); // 3.14
		DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
		varargs.forEach(System.out::print); // 1.01.11.2
		System.out.println();
		
		// Infinite Streams
		System.out.println();
		System.out.println("Infinite Streams :");
		var random = DoubleStream.generate(Math::random);
		var fractions = DoubleStream.iterate(0.5, d -> d/2);
		random.limit(3).forEach(System.out::println); // 0.9674972976917994 0.4015407238333688
		fractions.limit(3).forEach(System.out::println); // 0.5 0.25 0.125
		System.out.println();
		
		// range and range closed
		System.out.println();
		System.out.println("Range and Range Closed");
		IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
		count.forEach(System.out::println); // 1 2 3 4 5
		
		IntStream range = IntStream.range(1, 6);
		range.forEach(System.out::println); // 1 2 3 4 5
		
		IntStream rangeClosed = IntStream.rangeClosed(1, 5);
		rangeClosed.forEach(System.out::println); // 1 2 3 4 5
		System.out.println();
		
		// Mapping Streams
		System.out.println();
		System.out.println("Map to IntStream");
		Stream<String> objStream = Stream.of("pengiun", "fish");
		IntStream intStreamMap = objStream.mapToInt(s -> s.length());
		intStreamMap.forEach(System.out::println); // 7 4
		System.out.println();
		
		// flatmaps
		var integerList = new ArrayList<Integer>();
		IntStream ints = integerList.stream().flatMapToInt(x -> IntStream.of(x));
		DoubleStream doubles = integerList.stream().flatMapToDouble(x -> DoubleStream.of(x));
		LongStream longs = integerList.stream().flatMapToLong(x -> LongStream.of(x));
		
		/*
		 * Optional with primitives
		 */
		System.out.println("OptionalInt OptionalDouble OptionalLong");
		var stream = IntStream.rangeClosed(1, 10);
		OptionalDouble optional = stream.average();
		optional.ifPresent(System.out::println); // 5.5
		System.out.println(optional.getAsDouble()); // 5.5
		System.out.println(optional.orElseGet(() -> Double.NaN)); // 5.5
		
		LongStream longsStream = LongStream.of(5, 10);
		long longSum = longsStream.sum();
		System.out.println(longSum); // 15
		DoubleStream doublesStream = DoubleStream.generate(() -> Math.PI);
		// OptionalDouble min = doublesStream.min(); // infinite streams				
		System.out.println();		
		
		// Summary Statistics
		System.out.println("Summary Statistics");		
		var streamStats = IntStream.rangeClosed(1, 10);
		IntSummaryStatistics stats = streamStats.summaryStatistics();
		if(stats.getCount() == 0) throw new RuntimeException();
		System.out.println(stats.getMax() - stats.getMin()); // 9
		System.out.println();
		
		/*
		 * Functional Interfaces for primitives
		 */
		System.out.println("BooleanSupplier: ");		
		BooleanSupplier b1 = () -> true;
		BooleanSupplier b2 = () -> Math.random() > 0.5;
		System.out.println(b1.getAsBoolean()); // true
		System.out.println(b2.getAsBoolean()); // true or false depending the random value
		System.out.println();
		
	}
	
	public static Stream<Integer> mapping(IntStream stream) {
		
		return stream.mapToObj(x -> x);
		
	}
	
	public static Stream<Integer> boxing(IntStream stream) {
		
		return stream.boxed();
		
	}

}
