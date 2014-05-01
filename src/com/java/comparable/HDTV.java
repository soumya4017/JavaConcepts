package com.java.comparable;

public class HDTV implements Comparable<HDTV> {

	private String name;
	private int size;

	// Constructor
	public HDTV(String name, int size) {
		this.name = name;
		this.size = size;
	}

	// getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Rebase");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
		System.out.println("Testing");
	}

	// Now when we compare two HDTV objects, both should be compared wrt. their
	// size
	@Override
	public int compareTo(HDTV tv) {

		return this.size - tv.size;

		// Alternative way
		/*
		 * if (this.size > tv.size) { return 1; } else if (this.size < tv.size)
		 * { return -1; } else { return 0; }
		 */
	}

}
