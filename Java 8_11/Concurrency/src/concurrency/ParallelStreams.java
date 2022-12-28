package concurrency;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {
	
	public static void main(String args[]) {
		// Creation
		Stream<Integer> s1 = List.of(1,2).stream();
		Stream<Integer> s2 = s1.parallel();
		
		Stream<Integer> s3 = List.of(1,2).parallelStream(); 
		
		// Parallel Decomposition
		long start = System.currentTimeMillis();
		List.of(1,2,3,4,5)
			.stream()
			.map(w -> doSomeWork(w))
			.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		var timeTaken = (System.currentTimeMillis() - start)/1000;
		System.out.println("Time: " + timeTaken + " seconds");
		
		long start1 = System.currentTimeMillis();
		List.of(1,2,3,4,5)
			.parallelStream()          // Order is not guaranteed but performance improved
			.map(w -> doSomeWork(w))
			.forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		var timeTaken1 = (System.currentTimeMillis() - start1)/1000;
		System.out.println("Time: " + timeTaken1 + " seconds");
	}
	
	private static int doSomeWork(int input) {
		try {
			Thread.sleep(1000);
		} catch(InterruptedException ex) {
			
		}
		return input;
	}

}
