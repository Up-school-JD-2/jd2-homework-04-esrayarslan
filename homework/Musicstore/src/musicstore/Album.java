package musicstore;
import java.util.List;

public class Album {


	    private String albumName;
	    private String artistName;
	    private String releaseDate;
	    private List<Song> songs;
	    private double totalPrice;

	    public Album(String albumName, String artistName, String releaseDate, double totalPrice) {
	        this.albumName = albumName;
	        this.artistName = artistName;
	        this.releaseDate = releaseDate;
	        this.totalPrice = totalPrice;
	    }

	   

		public String getAlbumName() {
	        return albumName;
	    }

	    public void setAlbumName(String albumName) {
	        this.albumName = albumName;
	    }

	    public String getArtistName() {
	        return artistName;
	    }

	    public void setArtistName(String artistName) {
	        this.artistName = artistName;
	    }

	    public String getReleaseDate() {
	        return releaseDate;
	    }

	    public void setReleaseDate(String releaseDate) {
	        this.releaseDate = releaseDate;
	    }

	    public List<Song> getSongs() {
	        return songs;
	    }

	    public void setSongs(List<Song> songs) {
	        this.songs = songs;
	    }

		public Song addSong(Song song) {
	
			return song;
			
		}
		public double getTotalPrice() {
			return totalPrice;
		}



		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}

		public void printAlbumInfo(){
	        System.out.println("Müzisyen Adı: " + artistName);
	        System.out.println("Album Adı: " + albumName);
	        System.out.println("Yayın Tarihi: " + releaseDate);
	        System.out.println();
	    }



		
		

	}


