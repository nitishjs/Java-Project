package com.nt.learning.araay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class array {

	private static final String Fourth = null;

	public static void main(String[] args) {
		System.out.println("chaitra");
		ArrayList<String> list = new ArrayList<>(Arrays.asList("banana", "guava", "apple", "cheeku"));
		System.out.println(list.contains("apple"));
		System.out.println(list.indexOf("apple"));

		String[] array = new String[] { "FIRST", "SECOND", "THIRD", "FOURH" };
		System.out.println(Arrays.toString(array));
		String[] arr1 = new String[] { "FIFTH", "SIXTH" };
		String[] arr2 = new String[] { "SEVENTH", "EIGHT" };
		String[][] arrayOfArray = new String[][] { arr1, arr2 };
		System.out.println(Arrays.deepToString(arrayOfArray));
		List<String> list1 = new ArrayList<>();
		list1.add("First");
		list1.add("Second");
		list1.add("Third");
		list1.add(Fourth);
		System.out.println(list1);
		String[] array1 = new String[] { "First", "Second", "Third", "Fourth" };

		// Print the array using default toString method - Do not Use it
		System.out.println(array1.toString());
		System.out.println(Arrays.toString(array));
		String[] arr11 = new String[] { "Fifth", "Sixth" };
		String[] arr21 = new String[] { "Seventh", "Eigth" };
		String[][] arrayOfArray1 = new String[][] { arr11, arr21 };
		System.out.println(arrayOfArray);
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "A");
		map.put(2, "B");

		map.put(3, "C");
		SortedSet<Integer> sortedSet = new TreeSet<>();
		sortedSet.add(2);
		sortedSet.add(1);
		sortedSet.add(1);
		sortedSet.add(3);
		System.out.println(sortedSet);
		ArrayList<Integer> list11 = new ArrayList<>();
		list11.add(1);
		list11.add(2);
		list11.add(3);
		list11.forEach(System.out::print);

	}
}
