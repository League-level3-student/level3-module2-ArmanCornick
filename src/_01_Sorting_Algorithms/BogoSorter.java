package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	Random q = new Random();
	Boolean sorted = false;


	@Override
	void sort(int[] arr, SortingVisualizer display) {

		while (sorted == false) { // while not sorted
		
					int e = q.nextInt(arr.length);
					int u = q.nextInt(arr.length);
					int p = arr[u];
					arr[u] = arr[e];
					arr[e] = p;
				display.updateDisplay();
			}
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					break;
				}
				if(i == arr.length - 2) {
					sorted = true;
				}
				
			}
			
			
			
		}
	}

