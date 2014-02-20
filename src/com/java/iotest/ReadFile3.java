package com.java.iotest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile3 {

    public static void main(String[] args) {
	try {
	    FileReader fr = new FileReader("resources/abc.txt");
	    int readit = 0;
	    while ((readit = fr.read()) != -1) {
		System.out.print((char) readit);
	    }
	    System.out.flush();
	    fr.close();
	} catch (FileNotFoundException fne) {
	    fne.printStackTrace();
	} catch (IOException ioe) {
	    ioe.printStackTrace();
	}

    }

}
