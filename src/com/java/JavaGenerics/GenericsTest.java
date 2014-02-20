package com.java.JavaGenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsTest {
	
	private final static List projects =  new ArrayList<>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		projects.add ("RSI");
		projects.add("CS");
		
		/*for (Object o : projects) {
			System.out.println(o); 
		}*/
		//RSI 
		//CS
		
		/*for (Iterator i = projects.iterator(); i.hasNext();) {
			String project = (String) i.next();
			System.out.println(project);
		}*/
		/*RSI
		CS*/
	}

}
