package functional_programming;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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
		
		// findany and findFirst
		Stream<String> sFindAny = Stream.of("monkey", "gorilla", "bonobo");
		sFindAny.findAny().ifPresent(System.out::println); // monkey
		
		Stream<String> sFindFirst = Stream.of("gorilla", "bonobo", "monkey");
		sFindFirst.findAny().ifPresent(System.out::println); // gorilla
		
		Stream<String> infiniteStream = Stream.generate(() -> "chimp");
		infiniteStream.findAny().ifPresent(System.out::println); // chimp
		
		// allMatch, anyMatch and noneMatch
		var listMatch = List.of("monkey", "2", "chimp");
		Stream<String> infiniteMatch = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		
		System.out.println(listMatch.stream().allMatch(pred)); // false
		System.out.println(listMatch.stream().anyMatch(pred)); // true
		System.out.println(listMatch.stream().noneMatch(pred)); // false
		System.out.println(infiniteMatch.anyMatch(pred)); // true
		
		// forEach
		Stream<String> sforEach = Stream.of("monkey", "gorilla", "bonobo");
		sforEach.forEach(System.out::print); // monkeygorillabonobo
		
		// reduce
		System.out.println();
		var array = new String[] {"w", "o", "l", "f"};
		var result = "";
		for(var sarray : array) {
			result += sarray;
		}
		System.out.println(result); // wolf
		
		Stream<String> stream = Stream.of("w", "o", "l", "f");
		String word = stream.reduce("", (a, u) -> a + u);
		System.out.println(word); // wolf
		Stream<String> emptyReduce = Stream.empty();
		System.out.println(emptyReduce.reduce("default", (a, u) -> "")); // default
		
		Stream<String> streamReduceOptional = Stream.of("w", "o", "l", "f");
		Optional<String> wordReduceOptional = streamReduceOptional.reduce((a, u) -> a + u);
		System.out.println(wordReduceOptional.get());
		
		Stream<String> streamReduceCollector = Stream.of("w", "o", "l", "f");
		int wordStreamCollector = streamReduceCollector.reduce(0, (i, v) -> i + v.length(), (a, u) -> a + u);
		System.out.println(wordStreamCollector); // 4
		
		// collect
		Stream<String> streamCollect = Stream.of("w", "o", "l", "f");
		StringBuilder wordCollect = streamCollect.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(wordCollect); // wolf
		
		Stream<String> streamCollect1 = Stream.of("w", "o", "l", "f");
		TreeSet<String> wordCollectTreeSet = streamCollect1.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		System.out.println(wordCollectTreeSet); // [f, l, o, w]
		
		Stream<String> streamCollector = Stream.of("w", "o", "l", "f");
		TreeSet<String> wordCollectorTreeSet = streamCollector.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(wordCollectorTreeSet); // [f, l, o, w]
		
		/*
		 * Intermediate operations
		 */
		
		// filter
		System.out.println();
		System.out.println("Filter Intermediate function : ");
		Stream<String> sFilter = Stream.of("monkey", "gorilla", "bonobo");
		sFilter.filter(x -> x.startsWith("m"))
		.forEach(System.out::println); // monkey
		
		// distinct
		System.out.println();
		System.out.println("Distinct Intermediate function : ");
		Stream<String> sDistinct = Stream.of("monkey", "monkey", "bonobo");
		sDistinct.distinct().forEach(System.out::println); // monkey bonobo
		
		// limt and skip
		System.out.println();
		System.out.println("Limit and skip Intermediate functions : ");
		Stream<Integer> sLimitSkip = Stream.iterate(1, i -> i + 1);
		sLimitSkip.skip(5)
				  .limit(2)
				  .forEach(System.out::print); //67
	}

}
