package com.java.comparable;

/*
 * Comparable is implemented by a class in order to be able to comparing object of itself with some other objects. 
 * The class itself must implement the interface in order to be able to compare its instance(s). 
 * The method required for implementation is compareTo().
 */
public class TestComparable {

	public static void main(String[] args) {
		HDTV tv1 = new HDTV("Sony", 55);
		HDTV tv2 = new HDTV("Samsung", 45);
		if (tv1.compareTo(tv2) > 0) {
			System.out.println("Sony is better");
		} else if (tv1.compareTo(tv2) < 0) {
			System.out.println("Samsung is better");
		} else {
			System.out.println("Both Sony and Samsung are equal");
		}
	}

}
