package com.java.iotest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * The no-argument InputStream.read() method returns an int value. 
 * Only the low-order 8 bits contains the byte of data. 
 * The method returns -1 on reaching the end of the stream. 
 * Symmetrically, OutputStream.write(int) accepts an int as an argument, but only the low-order 8 bits are written.
 * 
 */
public class ReadFile1 {

    public static void main(String[] args) {
	try {
	    FileInputStream fis = new FileInputStream("resources/abc.txt");
	    int readit = 0;
	    while ((readit = fis.read()) != -1) {
		System.out.print((char) readit);
	    }
	    fis.close();
	} catch (FileNotFoundException fne) {
	    fne.printStackTrace();
	} catch (IOException ioe) {
	    ioe.printStackTrace();
	}
    }

}
