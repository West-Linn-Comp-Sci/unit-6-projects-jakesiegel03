

public class Album
{
   private String name;
   private String artist;
   private int numSongs;
   private double length;
   public Album(String name, String artist, int numSongs, double length){
       this.name = name;
       this.artist = artist;
       this.numSongs = numSongs;
       this.length = length;
    }
   public double getLength(){
       return length;
    }
   public int getNumSongs(){
       return numSongs;
    }
   public String getName(){
       return name;
    }
   public String getArtist(){
       return artist;
    }
   public String toString(){
       String result  = "Tilte: " + name +"\nArtist: " + artist
                        +"\nNumber of songs: " + numSongs +"\nLength of the album: "
                        + length +" minutes";
       return result;
    }
}
