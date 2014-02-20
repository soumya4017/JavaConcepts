package com.java.iotest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTerminal1 {

	public static void main(String[] args) {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		
		String line;
		try {
			line = bfr.readLine();
			System.out.println("The name is :"+line);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
