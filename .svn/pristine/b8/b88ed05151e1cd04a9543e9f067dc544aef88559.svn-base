package com.java.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableTreeSet {

	static HDTV hdtvObj= null;
	public static void main(String[] args) {
		TreeSet<HDTV> tvTree = new TreeSet<>();
		tvTree.add(new HDTV("Samsung", 15));
		tvTree.add(new HDTV("Sony", 20));
		tvTree.add(new HDTV("Onida", 15));
		tvTree.add(new HDTV("Samsung", 15));
		
		Iterator<HDTV> iter = tvTree.iterator();
		
		while (iter.hasNext()) {
			hdtvObj =  iter.next();
			System.out.println(hdtvObj.getName()+"("+hdtvObj.getSize()+")");
			
		}
	}

}

//Output : 
//Samsung(15)
//Sony(20)