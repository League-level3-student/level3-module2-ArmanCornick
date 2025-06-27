package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
    	String list1[] = {"cow", "sheep", "llama", "rooster", "pig", "chicken", "calf"};
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(5, _01_LinearSearch.linearSearch(list1, "Chicken".toLowerCase()));
        assertEquals(3, _01_LinearSearch.linearSearch(list1, "rooster"));
        assertEquals(-1, _01_LinearSearch.linearSearch(list1, "cat"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int list2[] = {1,2,3,7,11,24,56,83,102};
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(5, _02_BinarySearch.binarySearch(list2, 0, list2.length-1, 24));
        assertEquals(3, _02_BinarySearch.binarySearch(list2, 0, list2.length-1, 7));
        assertEquals(-1, _02_BinarySearch.binarySearch(list2, 0, list2.length-1, 23));
    }
}
