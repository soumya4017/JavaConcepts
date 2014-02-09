package com.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Comparator is capable of comparing two DIFFERENT types of objects. 
 * The method required for implementation is compare(). 
 * Now let’s use another way to compare those TVs size. 
 * The common use of Comparator is sorting. 
 * Both Collections and Arrays classes provide a sort method which use a Comparator.
 * 
*/

public class TestComparator {

	public static void main(String[] args) {
		HDTV tv1 = new HDTV ("Sony", 45);
		HDTV tv2 = new HDTV ("Samsung", 55);
		HDTV tv3 = new HDTV ("Onida", 65);
		
		List<HDTV> tvs = new ArrayList<>();
		tvs.add(tv1);
		tvs.add(tv2);
		tvs.add(tv3);
		
		Collections.sort(tvs, new SizeComparator());
		System.out.println("Sorted by Size");
		for (HDTV eachTV : tvs) {
			System.out.println(eachTV.getName()+"("+eachTV.getSize()+")");
		}
		
		Collections.sort(tvs, new NameComparator());
		System.out.println("\nSorted by Name");
		for (HDTV eachTV : tvs) {
			System.out.println(eachTV.getName()+"("+eachTV.getSize()+")");
		}
		
	}

}
