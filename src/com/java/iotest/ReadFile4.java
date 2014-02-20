package com.java.iotest;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile4 {

	public static void main(String[] args) {
		try {
			/*
			
			BufferedReader bfr = new BufferedReader(new FileReader ("resources/abc.txt"));
			
			String line = null;
			while ((line = bfr.readLine()) != null) {
				System.out.println(line);
			}
			bfr.close();
			
			*/
			
			/*
			
			BufferedInputStream bisr = new BufferedInputStream(new FileInputStream ("resources/abc.txt"));
			int readit = 0;
			while ((readit = bisr.read()) > -1) {
				System.out.print((char)readit);
			}
			bisr.close();
			
			*/
			
			BufferedInputStream bisr = new BufferedInputStream(new FileInputStream ("resources/abc.txt"));
			byte[] buffer = new byte[1024];
			int len = 0;
			
			while ((len = (int) bisr.read(buffer)) != -1) {
				System.out.write(buffer, 0, len);
			}
			bisr.close();
		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
