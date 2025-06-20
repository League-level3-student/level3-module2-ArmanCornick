package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
    public BubbleSorter() {
        type = "Bubble";
    }
    int startIndex = 1;
    /* 
     * Use the bubble sorting algorithm to sort the array.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] arr, SortingVisualizer display) {
    	
    	for(int r = 0; r < arr.length; r++) {
		for (int i = startIndex; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
              int t = arr[i];
              arr[i] = arr[i - 1];
              arr[i - 1] = t;

              startIndex = i;
             
            }
          } 
		  display.updateDisplay();
          startIndex = 1;
    	}
    }
}
