package com.java.programcreek;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jyotiranjan 09-Feb-2014
 * 
 *         Sort content in a txt file
 */
public class SortFileLine {

    /**
     * @param args
     */
    public static void main(String[] args) {
	try {
	    BufferedReader bfr = new BufferedReader(new FileReader(
		    "resources/unsortLine.txt"));
	    String line = null;
	    List<String> lines = new ArrayList<>();
	    while ((line = bfr.readLine()) != null) {
		if (!line.startsWith("--") && line.length() > 0) {
		    lines.add(line);
		}
	    }

	    Collections.sort(lines);
	    bfr.close();

	    BufferedWriter bfw = new BufferedWriter(new FileWriter(
		    "resources/sortedLine.txt"));
	    for (String eachLine : lines) {
		bfw.write(eachLine + "\n");
	    }
	    bfw.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
}
