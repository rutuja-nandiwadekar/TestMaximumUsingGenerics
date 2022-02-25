/*
 * Extend the max method to take more then three parameters
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
	 * This generic method is used to find max among more than 3 variables of
	 * Generic Type
	 */
	@SafeVarargs
	public static <T extends Comparable<T>> T testMaximum(T... value) {
		T max = value[0]; // assume a is initially the largest

		for (int i = 1; i < value.length; i++) {
			if (value[i].compareTo(max) > 0) {
				max = value[i];
			}
		}
		System.out.println("Maximum Value is= " + max);
		return max; // returns the largest value
	}

	// main method
	public static void main(String[] args) {
		// Calling method And passing values
		Maximum.<Integer>testMaximum(3, 4, 5, 9);

		Maximum.<Float>testMaximum(6.6f, 8.8f, 7.7f, 9.3f);

		Maximum.<String>testMaximum("Apple", "Pear", "Banana", "orange", "chiku");
	}
}
