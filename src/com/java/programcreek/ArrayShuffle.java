package com.java.programcreek;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author jyotiranjan 09-Feb-2014
 * 
 *         Shuffle elements in an array
 */
public class ArrayShuffle {

    /**
     * Input: an int array Output: shuffled array(in an randomized order)
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
	// int[] arr = new int[] { 1, 4, 6, 2 };
	Integer[] arr = new Integer[] { 1, 4, 6, 2 };
	shuffleArray(arr);

	for (int e : arr) {
	    System.out.println(e + "\t");
	}
    }

    private static void shuffleArray(Integer[] arr) {
	Collections.shuffle(Arrays.asList(arr));

    }
    /**
     * Alternate way
     * 
     * private static void shuffleArray(int[] arr) { Random ranNum = new
     * Random(); int temp; boolean dup = false; for (int i = 0; i < arr.length;
     * i++) { int newIndex = ranNum.nextInt(arr.length); // Swap two elements
     * temp = arr[i]; arr[i] = arr[newIndex]; arr[newIndex] = temp;
     * 
     * } }
     */

}
