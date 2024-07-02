package com.javaListWithObjects;

public class Example1 {

	public static void main(String[] args) {
		// Create an array of integers
		int array[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		// Print the original array
		System.out.println("Original array:");
		for (int value : array) {
			System.out.print(value + " ");
		}
		System.out.println();

		// Sort the array in ascending order
		System.out.println("---------Ascending------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				// Compare logic and swap if needed
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print(array[i] + " ");
		}
		System.out.println();

		// Sort the array in descending order
		System.out.println("---------Descending------------");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				// Compare logic and swap if needed
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print(array[i] + " ");
		}
	}
}
