/*
 * Extend the max method to also print the max to std out using Generic Method
 */
package com.bridgelabz;

//generic class
public class Maximum<T extends Comparable<T>> {
	/*
	 * This generic method is used to find max among more than 3 variables of
	 * Generic Type
	 */
	@SafeVarargs
	public static <T extends Comparable<T>> T testMaximum(T... value) {
		T max = value[0]; // assume a is initially the largest
		// checking max value
		for (int i = 1; i < value.length; i++) {
			if (value[i].compareTo(max) > 0) {
				max = value[i];
			}
		}
		System.out.println("given values are : ");
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		printMax(max);// internally calling printMax generic method
		return max; // returns the largest value
	}

	// generic method to print the max value
	public static <T> void printMax(T max) {
		System.out.println("\nMaximum Value is= " + max + "\n");
	}

	// main method
	public static void main(String[] args) {
		// Calling method And passing values
		Maximum.<Integer>testMaximum(3, 4, 5, 9, 20, 33);

		Maximum.<Float>testMaximum(6.6f, 8.8f, 7.7f, 9.3f);

		Maximum.<String>testMaximum("Apple", "Pear", "Banana", "orange", "chiku");
	}
}
