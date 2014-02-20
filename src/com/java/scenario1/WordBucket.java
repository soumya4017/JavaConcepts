package com.java.scenario1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*Scenario:
 There are few sentences in a file. We have to order the words as per the count in the most efficient way
 */
public class WordBucket {

    public static void main(String[] args) {
	// 1. Build the string
	StringBuilder sb = new StringBuilder();

	try {
	    BufferedReader bfr = new BufferedReader(new FileReader(
		    "resources/CountWords.txt"));
	    String line = null;
	    while ((line = bfr.readLine()) != null) {
		sb.append(line);
	    }
	    bfr.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	// Make an array of words
	String[] strArr = sb.toString().split(" ");

	// Populate a HashMap<word, counts>
	Map<String, int[]> counter = new HashMap<String, int[]>();
	for (String s : strArr) {
	    int[] eachArray = counter.get(s);
	    if (eachArray == null) {
		counter.put(s, new int[] { 1 });
	    } else {
		eachArray[0]++;
	    }
	}

	// Now HashMap is ready, we have to compare counts of each word and sort
	// in descending order, for that we will use Comparator Interface
	CountComparator cc = new CountComparator(counter);

	// Comparator will comapare words according to theri count and put the
	// words in a tree map, which will arrange the orders according to the
	// count
	Map<String, int[]> tm = new TreeMap<String, int[]>(cc);
	tm.putAll(counter);

	// Let's traverse the tree map and display the words and their counts
	for (Map.Entry<String, int[]> eachEntry : tm.entrySet()) {
	    System.out.println(eachEntry.getKey() + ":"
		    + eachEntry.getValue()[0]);
	}
    }

}
