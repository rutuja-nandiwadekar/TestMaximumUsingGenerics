/*
 * Refactor to create Generic Class to take in 3
 * variables of Generic Type
 */
package com.bridgelabz;

//generic class
public class Maximum<T extends Comparable<T>> {
	T a;
	T b;
	T c;

	// constructor
	public Maximum(T a, T b, T c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/*
	 * This generic method is used to find max among 3 variables of Generic Type
	 */
	public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {
		T max = a; // assume a is initially the largest

		if (b.compareTo(max) > 0) {
			max = b;
		}
		if (c.compareTo(max) > 0) {
			max = c;
		}
		return max; // returns the largest value
	}

	// main method
	public static void main(String[] args) {
		// Calling method And passing values
		System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, Maximum.<Integer>testMaximum(3, 4, 5));
		System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7,
				Maximum.<Float>testMaximum(6.6f, 8.8f, 7.7f));
		System.out.printf("Max of %s, %s and %s is %s\n", "Apple", "Pear", "Banana",
				Maximum.<String>testMaximum("Apple", "Pear", "Banana"));
	}
}
