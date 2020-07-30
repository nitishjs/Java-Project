package com.nt.learning.araay;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

public class Arrayrange {
	public static void main(String[] args) {
		String[] names = { "Alex", "Brain", "Charles", "David" };
		String[] partialNames = Arrays.copyOfRange(names, 0, 2);
		System.out.println(Arrays.copyOfRange(names, 0, 2)[1]);
		List<String> namesList = Arrays.asList(Arrays.copyOfRange(names, 2, names.length));
		System.out.println(Arrays.asList(Arrays.copyOfRange(names, 2, names.length)));
		System.out.println("=====================================");

		System.out.println(partialNames[0]);
		System.out.println(namesList);
		String[] names1 = { "Alex", "Brain", "Charles", "David" };
		String[] endNames1 = Arrays.copyOfRange(names1, 2, names1.length);
		System.out.println(Arrays.copyOfRange(names1, 2, names1.length)[0]);
		System.out.println(endNames1[1]);
		String[] moreNames = Arrays.copyOfRange(names, 2, 10);
		System.out.println(Arrays.copyOfRange(names, 2, 10)[0]);
		String blogName = "how to develop a code in java";
		String[] words = null;
		words = blogName.split(" ");
		System.out.println(words);
		for (String string : words) {
			System.out.println(string);
			// Method 2 :: using Pattern.split() method
			Pattern pattern = Pattern.compile(" ");
			words = pattern.split(blogName); // [how, to, do, in,java]
			System.out.println(words);
			for (String string1 : words) {
				System.out.println(string1);
				String names2 = "alex,brain,charles,david";
				String[] namesArray = null;
				namesArray = names2.split(",");

				System.out.println(Arrays.toString(namesArray));
				String[] tokens = { "How", "To", "Do", "In", "Java" };
				String blogName1 = String.join("", tokens);
				String blogName2 = String.join(" ", tokens);
				String blogName3 = String.join("-", tokens);
				System.out.println(blogName1);
				System.out.println(blogName2);
				System.out.println(blogName3);

				// Byte[] to String

				String name = "howtodoinjava.com";
				byte[] byteArray = name.getBytes();
				String str = new String(byteArray);
				String strWithCharset = new String(byteArray, Charset.defaultCharset());
				System.out.println("Original Structure: " + name);
				System.out.println("Originaled Structure: " + str);
				System.out.println("Originaled Structure: " + strWithCharset);
				// string constructor-new String(byte[])
				// byte array to string
				byte[] bytes = "hello world".getBytes();
				// Convert byte[] to string
				String s = new String(bytes);
				System.out.println(s);
				// Java convert String to byte[]
				// String.getBytes() method
				String string11 = "howtodoinjava.com";
				// convert string to byte[]
				byte[] bytes1 = string.getBytes();
				System.out.println(string.getBytes());
				System.out.println(bytes1);
				// Base64 class in Java 8
				// Base64.getDecoder().decode() method converts a string to byte array.

				// byte array to string
				// String
				// String string = "howtodoinjava.com";

				// Base64 Decoded
				// byte[] bytes1 = Base64.getDecoder().decode(string1);

				// Union between two integer arrays

				Integer[] firstArray = { 0, 2, 4, 6, 11, 12, 8 };
				Integer[] secondArray = { 1, 3, 4, 11, 5, 7, 9, 23 };
				HashSet<Integer> set = new HashSet<>();
				set.addAll(Arrays.asList(firstArray));
				set.addAll(Arrays.asList(secondArray));
				System.out.println(set);
				// convert to Array
				Integer[] union = {};
				union = set.toArray(union);
				System.out.println(Arrays.toString(union));

				// union betweeen two String Arrays

				String[] firstArray1 = { "A", "B", "C", "D" };
				String[] secondArray1 = { "D", "A", "E", "F" };
				HashSet<String> set1 = new HashSet<>();
				set1.addAll(Arrays.asList(firstArray1));
				set1.addAll(Arrays.asList(secondArray1));
				System.out.println(set1);
				// convert to array
				String[] union1 = {};
				union1 = set1.toArray(union1);
				System.out.println(Arrays.toString(union1));
				// intersecton between two Integer arrays

				Integer[] firstArray2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
				Integer[] secondArray2 = { 1, 3, 5, 7, 9 };
				HashSet<Integer> set2 = new HashSet<>();
				set2.addAll(Arrays.asList(firstArray2));
				set2.retainAll(Arrays.asList(secondArray2));
				System.out.println(set2);
				// convert to Arrays

				Integer[] intersection = {};
				intersection = set2.toArray(intersection);
				System.out.println(Arrays.toString(intersection));
				// intersection between two string Arrays
				String[] firstArray3 = { "A", "B", "C", "D" };
				String[] secondArray3 = { "D", "A", "E", "F" };
				HashSet<String> set3 = new HashSet<>();
				set3.addAll(Arrays.asList(firstArray3));
				set3.retainAll(Arrays.asList(secondArray3));
				System.out.println(set3);
				// convert to arrays
				String[] intersection1 = {};
				intersection1 = set3.toArray(intersection1);
				System.out.println(Arrays.toString(intersection1));

			}
		}
	}
}
