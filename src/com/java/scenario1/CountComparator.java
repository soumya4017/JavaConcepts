package com.java.scenario1;

import java.util.Comparator;
import java.util.Map;

public class CountComparator implements Comparator<String> {
    Map<String, int[]> counterMap;

    public CountComparator(Map<String, int[]> counterMap) {
	this.counterMap = counterMap;
    }

    @Override
    public int compare(String word1, String word2) {
	return counterMap.get(word2)[0] - counterMap.get(word1)[0];
    }

}
