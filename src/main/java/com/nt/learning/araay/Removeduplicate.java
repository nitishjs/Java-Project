package com.nt.learning.araay;

import java.util.Arrays;

public class Removeduplicate {

	/*
	 * public static void main1(String[] args) throws CloneNotSupportedException
	 * Arrays with duplicate element Integer[] numbers = new Integer[]
	 * {1,2,3,4,5,1,3,5}; System.out.println(Arrays.toString(numbers)); // Greatest
	 * from array element LinkedHashSet<Integer> linkedHashSet =
	 * newLinkedHashSet<>(Arrays.asList(numbers)); Integer[]
	 * numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
	 * 
	 * //Verify the array content
	 * System.out.println(Arrays.toString(numbersWithoutDuplicates));
	 * 
	 * /** Array element are sorted: Create a new array 'tempArray' with same size
	 * as original array 'origArray'. Iterate over array starting from index
	 * location ‘0’. Match current element with next element indexes until mismatch
	 * is found. Add element to 'tempArray' and make current element to element
	 * which was mismatched. Continue the iteration.
	 * 
	 */

	// Array with duplicate elements
	/*
	 * public static void main(String[] args) throws CloneNotSupportedException { //
	 * Array with duplicate elements Integer[] origArray = new Integer[] { 1, 2, 4,
	 * 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };
	 * 
	 * // This array has duplicate elements
	 * System.out.println(Arrays.toString(origArray));
	 * 
	 * Integer[] tempArray = removeDuplicates(origArray);
	 * 
	 * // Verify the array content System.out.println(Arrays.toString(tempArray)); }
	 * 
	 * private static Integer[] removeDuplicates(Integer[] origArray) {
	 * 
	 * for (int j = 0; j < origArray.length - 1; j++) { for (int i = j + 1; i <
	 * origArray.length - 1; i++) { if (origArray[j] == origArray[i]) { origArray[i]
	 * = null; } } }
	 * 
	 * origArray[origArray.length - 1] = null;
	 * 
	 * return origArray;
	 */

	// 2.2 when Array element are not sorted
	public static void main(String[] args) throws CloneNotSupportedException {

		Integer[] origArray1 = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8 };

		// This array has duplicate elements
		System.out.println(Arrays.toString(origArray1));

		Integer[] tempArray1 = removeDuplicates1(origArray1);

		// Verify the array content System.out.println(Arrays.toString(tempArray1));
	}

	static Integer[] removeDuplicates1(Integer[] origArray1) {

		for (int j = 0; j < origArray1.length - 1; j++) {
			for (int i = j + 1; i < origArray1.length - 1; i++) {
				if (origArray1[j] == origArray1[i]) {
					origArray1[i] = null;
				}
			}
		}

		origArray1[origArray1.length - 1] = null;

		return origArray1;
	}

	// using java 8 UPI

	/*
	 * Integer[] origArray11 = new Integer[] { 1, 2, 4, 9, 7, 3, 4, 5, 8, 6, 1, 7, 8
	 * };
	 * 
	 * List<Integer> listWithoutDuplicates = Arrays.asList(origArray11) .stream()
	 * .distinct() .collect(Collectors.toList());
	 * 
	 * System.out.println(listWithoutDuplicates);
	 */

}
