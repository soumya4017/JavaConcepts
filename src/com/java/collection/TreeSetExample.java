package com.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	/**
	 * TreeSet is sorted
	 * How to iterate a TreeSet
	 * How to check empty
	 * How to retrieve first/last element
	 * How to remove an element
	 */
	public static void main(String[] args) {
		TreeSet<Integer> myTree = new TreeSet<>();
		myTree.add(35);
		myTree.add(45);
		myTree.add(25);
		myTree.add(35);
		
		//Traversal of TreeSet
		Iterator<Integer> iter = myTree.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());  //Output : 25, 35, 45
		}
		
		//EmptyChecking
		if (myTree.isEmpty()) {
			System.out.println("Tree is empty");
		} else {
			System.out.println("Tree is not empty");
		}
		
		//retrieving First element
		System.out.println("First Element: "+myTree.first());
		System.out.println("Last Element: "+myTree.last());
		
		//Removing an element
		myTree.remove(35);
		Iterator<Integer> iter2 = myTree.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());  //Output : 25, 45
		}
		
		//Clearing the tree
		myTree.clear();
		if (myTree.isEmpty()) {
			System.out.println("Tree is empty");
		} else {
			System.out.println("Tree is not empty");
		}
		
	}

}
