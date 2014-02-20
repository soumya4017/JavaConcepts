package com.java.overridingEquals;

public class OverridingEquals {

    public static void main(String[] args) {
	Songs song1 = new Songs("Yo Yo", "Sunny Sunny", "Yo Yo");
	Songs song2 = new Songs("Yo Yo", "Sunny Sunny", "Sunny Leone");
	Songs song3 = new Songs("Yo Yo", "Blue Eyes", "Yo Yo");

	System.out.println("song1 and song2 are equal?" + song1.equals(song2)); // true
	System.out.println("song1 and song3 are equal?" + song1.equals(song3)); // false

	System.out.println("Hash code of song1:" + song1.hashCode()); // -1547358271
	System.out.println("Hash code of song2:" + song2.hashCode()); // -1547358271
	System.out.println("Hash Code of song3:" + song3.hashCode()); // 197801883
    }

}
