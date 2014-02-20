package com.java.iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile2 {

    /* using a byte array as a buffer is more efficient: */

    public static void main(String[] args) {
	try {
	    FileInputStream fis = new FileInputStream("resources/abc.txt");
	    byte[] buffer = new byte[1024];
	    int len = 0;
	    while ((len = fis.read(buffer)) != -1) {
		System.out.write(buffer, 0, len);

		/*
		 * public void write(byte[] buf, int off, int len) buf - A byte
		 * array off - Offset from which to start taking bytes len -
		 * Number of bytes to write
		 */

	    }
	    fis.close();
	} catch (FileNotFoundException fne) {
	    fne.printStackTrace();
	} catch (IOException ioe) {
	    ioe.printStackTrace();
	}

    }

}
