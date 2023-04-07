package functional_programming;

import java.util.ArrayList;
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
	}
	
	public static Stream<Integer> mapping(IntStream stream) {
		
		return stream.mapToObj(x -> x);
		
	}
	
	public static Stream<Integer> boxing(IntStream stream) {
		
		return stream.boxed();
		
	}

}
