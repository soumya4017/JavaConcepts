package com.java.programcreek;

import java.util.Random;

/**
 * @author jyotiranjan 09-Feb-2014
 * 
 *         Given range, return an array of N random numbers
 */
public class ArrayRandom {

    public static void main(String[] args) {
	int[] arr = getNRandom(5, 100);
	for (int e : arr) {
	    System.out.print(e + "\t");
	}
    }

    /**
     * This is a method that accepts a range (max) and a number (n), returns an
     * array of n random numbers. n: size of random number array max: largest
     * available number (exclusive)
     * 
     * For example: Input: n=5, max=100 Output: an array containing 5 random
     * numbers whose range is from 0 to 99.
     */

    /**
     * @param n
     * @param max
     * @return
     */
    public static int[] getNRandom(int n, int max) {
	Random random = new Random();
	int[] randomArr = new int[n];
	for (int j = 0; j < n;) {

	    int thisOne = random.nextInt(max - 1);

	    boolean markDup = false;
	    for (int indexRandomArr = 0; indexRandomArr < n; indexRandomArr++) {
		if (randomArr[indexRandomArr] == thisOne) {
		    markDup = true;
		    break;
		}
	    }

	    if (!markDup) {
		randomArr[j] = thisOne;
		j++;
	    }

	}

	return randomArr;
    }

}
