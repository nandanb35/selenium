package com.practice.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 4, 6, 45, 8, 1, -2 };

		for (int unsortedLastIndex = arr.length - 1; unsortedLastIndex > 0; unsortedLastIndex--) {

			int largest = 1;
			for (int i = 0; i < unsortedLastIndex; i++) {
				if (arr[i] > arr[largest]) {
					largest = i;
				}
			}
			swap(arr, unsortedLastIndex, largest);
		}

		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		if (arr[i] == arr[j]) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
