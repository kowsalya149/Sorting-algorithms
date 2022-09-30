package com.sorting.algorithms;

import java.util.Arrays;

public class InsertionSort {

	public void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && temp <= arr[j]) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
	}

//	static void printArray(int arr[]) {
//		int n = arr.length;
//		for (int i = 0; i < n; ++i)
//			System.out.print(arr[i] + " ");
//
//		System.out.println();
//	}

	public static void main(String[] args) {

		int[] array = { 2, 12, 34, -5, 1 };
		InsertionSort sort = new InsertionSort();
		sort.insertionSort(array);
		
		System.out.println("sorting numbers by Insertion sort");
		//printArray(array);
		System.out.println(Arrays.toString(array));
	}

}
