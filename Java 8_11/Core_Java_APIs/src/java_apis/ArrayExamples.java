package java_apis;

import java.util.Arrays;

public class ArrayExamples {
	
	public static void main(String args[]) {
		int[] numbers1 = new int[3];
		int[] numbers12 = new int[] {1,2,3};
		int[] numbers2 = {1,2,3};
		System.out.println(Arrays.toString(numbers2));
		for(int i = 0 ; i < numbers2.length; i++) {
			System.out.print(numbers2[i] +" ");
		}
		System.out.println();
		for(int i : numbers2) {
			System.out.print(i + " ");
		}
		System.out.println();
		numbers2 = new int[] {3, 1, 5};
		Arrays.sort(numbers2);
		System.out.println(Arrays.toString(numbers2));
		System.out.println(Arrays.binarySearch(numbers2, 3));
		System.out.println(Arrays.binarySearch(numbers2, 100));
		
		System.out.println(Arrays.compare(numbers1, numbers12));
		System.out.println(Arrays.mismatch(numbers1, numbers12));
		
		int[][] vars1 = new int[2][3];
		vars1 = new int[][] {{1,2,3},{4,5,6}};
		int []vars2[] = {{4,5},{3}};
		
		for(int i = 0; i < vars1.length; i++) {
			for(int j = 0; j < vars1[i].length; j++) {
				System.out.print(vars1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i[] : vars1) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		int[] numAnimals;
		int [] numAnimals1;
		int []numAnimals2;
		int numAnimals3[];
		int numAnimals4 [];
	}

}
