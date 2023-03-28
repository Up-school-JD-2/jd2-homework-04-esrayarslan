package musicstore;

import java.math.BigDecimal;

public class Song {
	

	    private String songName;
	    private String artistName;
	    private Album album;
	    private double songLength;
	    private BigDecimal price;

	    public Song(String songName, String artistName, Album album, double songLenght) {
	        this.songName = songName;
	        this.artistName = artistName;
	        this.album = album;
	        this.songLength = songLenght;
	    }

	    public String getSongName() {
	        return songName;
	    }

	    public void setSongName(String songName) {
	        this.songName = songName;
	    }

	    public String getArtistName() {
	        return artistName;
	    }

	    public void setArtistName(String artistName) {
	        this.artistName = artistName;
	    }

	    public Album getAlbum() {
	        return album;
	    }

	    public void setAlbum(Album album) {
	        this.album = album;
	    }

	    public double getSongLength() {
	        return songLength;
	    }

	    public void setSongLength(double songLength) {
	        this.songLength = songLength;
	    }
	    public BigDecimal getPrice() {
			// TODO Auto-generated method stub
			return price;
		}

	    
	    public void printSongInfo(){
	        System.out.println("Müzisyen Adı :  " + artistName);
	        System.out.println("Şarkı Adı :  " + songName);
	        System.out.println("Şarkı Süresi : " + songLength);
	        System.out.println();
	    }

		
		
	}


