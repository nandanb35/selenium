package com.practice.sorting;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {

		int[] arr = { 12, 36, 6, 45, 8, 1, -2, 199, -19 };

		for (int gap = arr.length / 2; gap > 0; gap /= 2) {

			for (int i = gap; i < arr.length; i++) {

				int newElement = arr[i];
				int j = i;

				while (j >= gap && arr[j - gap] > newElement) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				arr[j] = newElement;
			}

		}

		System.out.println("***** Shell Sort *****");
		
		System.out.println("***** Shell Sort is extension of insertion sort *****");
		
		System.out.println("***** Testing stash *****");
		
		System.out.println("***** committing to master 26-01-21*****");

		System.out.println(Arrays.toString(arr));

	}

}
