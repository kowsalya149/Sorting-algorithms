package com.sorting.algorithms;

import java.util.Arrays;

public class SelectionSort {

	public void selectionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=0; i<n-1; i++) {
			int mid = i;
			for(int j=i+1; j<n; j++) {
				if(arr[j] < arr[mid])
					mid = j;
			}
			int temp = arr[mid];
			arr[mid] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {

		int[] array = { 2, 12, 34, 5, 1 };
		SelectionSort sort = new SelectionSort();
		sort.selectionSort(array);
		
		System.out.println("sorting numbers by Selection sort");
		System.out.println(Arrays.toString(array));
	}

}