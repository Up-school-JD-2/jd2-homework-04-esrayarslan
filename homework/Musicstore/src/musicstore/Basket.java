package musicstore;

import java.math.BigDecimal;
import java.util.List;

public class Basket {
	private List<Song> songs;
	private List<Album> albums;
	private BigDecimal totalPrice;

	

	
	public Basket(BigDecimal totalPrice) {
 
       this.totalPrice = totalPrice;
	}
	public Basket(List<Song> songs, List<Album> albums, BigDecimal totalPrice) {
		this.albums = albums;
		this.songs = songs;
		this.totalPrice = totalPrice;
	}
	
    public void addSong(Song song) {
        songs.add(song);
        totalPrice = totalPrice.add(song.getPrice());
    }
    
 
	
     public void removeSong(Song song) {
         songs.remove(song);
         totalPrice = totalPrice.subtract(song.getPrice());
     }

     public BigDecimal getTotalPrice() {
            return totalPrice;
     }

     public List<Song> getSongs() {
            return songs;
     }

      public void printInfoBasket(Album album) {
            System.out.println("Sepettekiler:");
            System.out.println("Album Adı : " + album.getAlbumName());
            System.out.println("Toplam Fiyat : " + album.getTotalPrice());
     }

		public void add(Album album) {
			// TODO Auto-generated method stub
			
		}

	

	

		


}