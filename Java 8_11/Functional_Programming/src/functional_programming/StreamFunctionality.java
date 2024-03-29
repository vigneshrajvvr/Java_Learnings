package functional_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
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
		Stream<String> iterateTest = Stream.iterate("-", s -> s.length() < 3, s -> s + s);
		System.out.println("Iterate with 3 parameters :");
		iterateTest.forEach(System.out::print);
		System.out.println(Stream.iterate(1, x -> x++)
			  .limit(5)
			  .map(x -> "" + x)
			  .collect(Collectors.joining())
			  );
		
		
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
		System.out.println();
		
		// map
		System.out.println();
		System.out.println("Map Intermediate functions : ");
		Stream<String> sMap = Stream.of("monkey", "gorilla", "bonobo");
		sMap.map(String::length).forEach(System.out::print); // 676
		System.out.println();
		
		// flatmap
		System.out.println();
		System.out.println("FlatMap Intermediate functions : ");
		List<String> zeroList = List.of();
		var one = List.of("Bonobo");
		var two = List.of("Mama Gorilla", "Baby Gorilla");
		Stream<List<String>> animals = Stream.of(zeroList, one, two);
		animals.flatMap(m -> m.stream()).forEach(System.out::print); // BonoboMama GorillaBaby Gorilla
		System.out.println();
		
		// sorted
		System.out.println();
		System.out.println("Sorted Intermediate functions : ");
		Stream<String> sSorted = Stream.of("brow-", "bear-");
		sSorted.sorted().forEach(System.out::print); // bear-brow-
		
		Stream<String> sSortedCompartor = Stream.of("brow-", "bear-");
		sSortedCompartor.sorted(Comparator.reverseOrder()).forEach(System.out::print); // brow-bear-		
		System.out.println();
		
		// peek
		System.out.println();
		System.out.println("Sorted Intermediate functions : ");
		Stream<String> sPeek = Stream.of("black bear", "brown bear", "grizzly");
		long count = sPeek.filter(sPeeks -> sPeeks.startsWith("g")).peek(System.out::print).count();
		System.out.println(count); // grizzly1
		System.out.println();
		
		// chaining of operations/pipeline
		// To get first two names from list of strings that are four characters long
		System.out.println();
		System.out.println("To get first two names from list of strings that are four characters long - Normal Way");
		var listNames = List.of("Toby", "Anna", "Leroy", "Alex");
		List<String> filteredStrings = new ArrayList<>();
		for(String listName : listNames) {
			if(listName.length() == 4) filteredStrings.add(listName);
		}
		Collections.sort(filteredStrings);
		var iter = filteredStrings.iterator();
		if(iter.hasNext()) System.out.println(iter.next()); // Alex
		if(iter.hasNext()) System.out.println(iter.next()); // Anna
		System.out.println();
		
		System.out.println();
		System.out.println("To get first two names from list of strings that are four characters long - Streams way");
		var listFilteredStream = List .of("Toby", "Anna", "Leroy", "Alex");
		listFilteredStream.stream().filter(x -> x.length() == 4)
						  .sorted()
						  .limit(2)
						  .forEach(System.out::print); // AlexAnna
		System.out.println();		
		
		// Collectors
		System.out.println();	
		System.out.println("Collectors - joining");		
		var ohMy = Stream.of("lions", "tigers", "bears");
		String resultCollectors = ohMy.collect(Collectors.joining(","));
		System.out.println(resultCollectors); // lions,tigers,bears
		System.out.println();		

		System.out.println("Collectors - averagningInt");		
		var ohMyAveragingInt = Stream.of("lions", "tigers", "bears");
		Double averagingIntResult = ohMyAveragingInt.collect(Collectors.averagingInt(String::length));
		System.out.println(averagingIntResult); // 5.333333333333333
		System.out.println();
		
		System.out.println("Collectors - toCollection");		
		var ohMyToCollection = Stream.of("lions", "tigers", "bears");
		TreeSet<String> ohMyResult = ohMyToCollection.filter(x -> x.startsWith("t"))
													 .collect(Collectors.toCollection(TreeSet::new));
		System.out.println(ohMyResult); // [tigers]
		System.out.println();
		
		System.out.println("Collectors - toMaps");		
		var ohMyToMaps = Stream.of("lions", "tigers", "bears");
		Map<String, Integer> ohMymapResult = ohMyToMaps.collect(Collectors.toMap(sm -> sm, String::length));
		System.out.println(ohMymapResult); // {lions=5, bears=5, tigers=6}
		System.out.println();
		
		var ohMyToMaps1 = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> ohMyMapResult1 = ohMyToMaps1.collect(Collectors.toMap(String::length, k -> k, (s1,s2) -> s1 + "," + s2));
		System.out.println(ohMyMapResult1); // {5=lions,bears, 6=tigers}
		System.out.println(ohMyMapResult1.getClass()); // class java.util.HashMap - but not guaranteed
		
		System.out.println();
		var ohMyToMaps2 = Stream.of("lions", "tigers", "bears");
		Map<Integer, String> ohMyMapResult2 = ohMyToMaps2.collect(Collectors.toMap(String::length, k -> k, (s1,s2) -> s1 + "," + s2, TreeMap::new));
		System.out.println(ohMyMapResult2); // {5=lions,bears, 6=tigers}
		System.out.println(ohMyMapResult2.getClass()); // class java.util.TreeMap - but not guaranteed
		System.out.println();
		
		System.out.println("Collectors - groupingBy");
		var ohMyGroupingBy1 = Stream.of("lions", "tigers", "bears");
		Map<Integer, List<String>> ohMyGroupingByResult1 = ohMyGroupingBy1.collect(Collectors.groupingBy(String::length));
		System.out.println(ohMyGroupingByResult1); // {5=[lions, bears], 6=[tigers]}
		
		var ohMyGroupingBy2 = Stream.of("lions", "tigers", "bears");
		Map<Integer, Set<String>> ohMyGroupingByResult2 = ohMyGroupingBy2.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
		System.out.println(ohMyGroupingByResult2); // {5=[lions, bears], 6=[tigers]}
		

		var ohMyGroupingBy3 = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, Set<String>> ohMyGroupingByResult3 = ohMyGroupingBy3.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet()));
		System.out.println(ohMyGroupingByResult3); // {5=[lions, bears], 6=[tigers]}
		
		var ohMyGroupingBy4 = Stream.of("lions", "tigers", "bears");
		TreeMap<Integer, List<String>> ohMyGroupingByResult4 = ohMyGroupingBy4.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));
		System.out.println(ohMyGroupingByResult4); // {5=[lions, bears], 6=[tigers]}
		System.out.println();
		
		System.out.println();
		System.out.println("Collectors - partitionBy");
		var ohMyPartitionBy1 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, List<String>> ohMyPartitionByResult1 = ohMyPartitionBy1.collect(Collectors.partitioningBy(sp -> sp.length() <= 5));
		System.out.println(ohMyPartitionByResult1); // {false=[tigers], true=[lions, bears]}
		
		var ohMyPartitionBy2 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, Set<String>> ohMyPartitionByResult2 = ohMyPartitionBy2.collect(Collectors.partitioningBy(sp -> sp.length() <= 5, Collectors.toSet()));
		System.out.println(ohMyPartitionByResult2); // {false=[tigers], true=[lions, bears]}

		var ohMyPartitionBy3 = Stream.of("lions", "tigers", "bears");
		Map<Boolean, Long> ohMyPartitionByResult3 = ohMyPartitionBy3.collect(Collectors.partitioningBy(sp -> sp.length() <= 5, Collectors.counting()));
		System.out.println(ohMyPartitionByResult3); // {false=1, true=2}
		System.out.println();
		
		System.out.println();
		System.out.println("Collectors - Mapping");
		var ohMyMapping1 = Stream.of("lions", "tigers", "bears");
		Map<Integer, Optional<Character>> ohMyMappingResult1 = ohMyMapping1.collect(
												Collectors.groupingBy(
														String::length, 
														Collectors.mapping(
																sc -> sc.charAt(0), 
																Collectors.minBy((a, b) -> a - b)
																)
														)
												);
		System.out.println(ohMyMappingResult1); // {5=Optional[b], 6=Optional[t]}
		System.out.println();
		
	}

}
