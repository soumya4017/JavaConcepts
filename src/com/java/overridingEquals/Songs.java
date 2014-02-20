package com.java.overridingEquals;

public class Songs {
    private String music;
    private String lyrics;
    private String singer;

    public Songs(String music, String lyrics, String singer) {
	this.setMusic(music);
	this.setLyrics(lyrics);
	this.setSinger(singer);
    }

    public String getMusic() {
	return music;
    }

    public void setMusic(String music) {
	this.music = music;
    }

    public String getLyrics() {
	return lyrics;
    }

    public void setLyrics(String lyrics) {
	this.lyrics = lyrics;
    }

    public String getSinger() {
	return singer;
    }

    public void setSinger(String singer) {
	this.singer = singer;
    }

    // If music and lyrics of both the songs are equal, we will say the songs
    // are same irrespective of singer who has sung the song

    @Override
    public boolean equals(Object object) {
	boolean result = false;
	if (object == null || object.getClass() != getClass()) {
	    result = false;
	} else {
	    Songs song = (Songs) object;
	    if (this.getMusic() == song.getMusic()
		    && this.getLyrics() == song.getLyrics()) {
		result = true;
	    }
	}

	return result;
    }

    // As per the contract, if equals() is overridden, hashcode() has to be
    // overridden
    // why?
    /*
     * Reason: Default implementation given is hashCode() method in Object class
     * uses the internal address of the object and converts it into integer and
     * returns it. This is the lowest form of equality implementation and
     * provides guaranteed results for hastables implementation. When we
     * override equals() and change the meaning of equality for an object then
     * the same should be reflected by overriding the hashCode method.
     */

    @Override
    public int hashCode() {
	int hash = 3;
	hash = 7 * hash + this.music.hashCode();
	hash = 7 * hash + this.lyrics.hashCode();
	return hash;
    }
}
