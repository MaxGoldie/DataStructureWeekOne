package week1;

import java.util.Arrays;

public class Testing {
	public static void main(String[] args) {
		Integer[] integers = { 9, 5, 7, 6, 4, 8, 2, 1, 3 };
		String[] strings = { "H", "I", "F", "A", "G", "B", "E", "D", "C", "J" };
		Double[] doubles = { 5.3, 6.3, 1.1, 1.0, 4.3, 8.3, 8.2 };
		System.out.println("Before Merge Sort:");
		System.out.println(Arrays.toString(integers));
		System.out.println(Arrays.toString(strings));
		System.out.println(Arrays.toString(doubles));
		System.out.println();
		System.out.println("After Merge Sort:");
		MergeSort<Integer> i = new MergeSort<>(integers);
		MergeSort<String> s = new MergeSort<>(strings);
		MergeSort<Double> d = new MergeSort<>(doubles);
		System.out.println(Arrays.toString(i.mergeSort()));
		System.out.println(Arrays.toString(s.mergeSort()));
		System.out.println(Arrays.toString(d.mergeSort()));

	}
}