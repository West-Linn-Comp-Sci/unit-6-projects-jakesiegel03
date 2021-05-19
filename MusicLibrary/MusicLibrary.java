
/**
 * Write a description of class MusicLibrary here.
 *
 * @author Jake Siegel
 * @version 5/2/2021
 */
public class MusicLibrary
{
    private Album[] library;
    private double totalPlayTime;
    private int totalTracks;
    private int openIndex;
    public MusicLibrary(){
        library = new Album[10];
        totalPlayTime = 0;
        totalTracks = 0;
        openIndex = 0;
    }
    public void doubleSize(){
        Album[] newLibrary = new Album[library.length*2];
        for(int i = 0;i<library.length; i++){
            newLibrary[i] = library[i];
        }
    }
    public void remove(int index){
        totalTracks -= library[index].getNumSongs();
        totalPlayTime -= library[index].getLength();
        library[index] = null;
        
    }
    public void add(Album album){
        if(openIndex == -1){
            System.out.println("Your music Library is full.");
        }
        else{
            library[openIndex] = album;
            totalTracks += album.getNumSongs();
            totalPlayTime += album.getLength();
            
            int n;
            for(n = 0; n<library.length;n++){
                if(library[n] == null){
                    openIndex = n;
                    break;
                }
            }
            if (n == library.length){
              openIndex = -1;  
            }
        }
    }
    public String toString(){
        String result = "Number of tracks: " + totalTracks + 
        "\nLength of album: " + totalPlayTime +" minutes" +"\nSize of library: " +
        library.length + " Albums: \n\n";
                    
        for(int i = 0; i<library.length; i++){
            if(library[i] != null)
            result += library[i] +"\n\n";
        }
        return result;
    }
    public String getAlbum(int a){
       
        return library[a].getName();
    }
    public void searchTitle(String Title){
        int a = 0;
        for(int i=0;i<library.length;i++){
            if(library[i] == null) {
            
        }else if(library[i].getName().equals(Title)){
                System.out.println( "The target album is in album number " +(i+1));
                a++;
                break;
            }
        } if(a==0)
          System.out.println("album not found"); 
    }
        public void searchArtist(String Artist){
        int a = 0;
        for(int i=0;i<library.length;i++){
            if(library[i] == null) {
            
        }else if(library[i].getArtist().equals(Artist)){
                System.out.println( "The target Artist is in album number " +(i+1));
                a++;
                break;
            }
        } if(a==0)
          System.out.println("album not found"); 
   }
   boolean sorted = false;
   public void insertionSort(){
   for(int i = 0; i < library.length; i++){
       Album key = library[i];
       int position = i;
       if(library[position] == null){
           System.out.println("Null");
           break;
        }
        
       while (position > 0 && library[position - 1].getArtist().charAt(0) > key.getArtist().charAt(0)){
           library[position] = library[position - 1];
           position--;
       }
       library[position] = key;
   }
   sorted = true;
}
public void selectionSort(){
   int min;
   Album temp;

   for( int i = 0; i < library.length - 1; i++){
       min = i;
       if(library[i]==null){
           break;
        }
       for(int scan = i + 1; scan < library.length; scan++){
           if(library[scan] ==null){
            
            }
           else if(library[scan].getName().charAt(0) < library[min].getName().charAt(0))
               min = scan;
       }

       temp = library[min];
       library[min] = library[i];
       library[i]= temp;
   }
   sorted = true;
}

public int binaryArtistSearch(String target){
 if(!sorted){
 System.out.println("Library not sorted");
 return -1;
}
 int index = Integer.MAX_VALUE;
 int i = library.length - 1;
 while(library[i] == null){
     i--;
    }
 int max = i;
 int min = 0;
 while(min<=max){
    int mid = (min+max)/2;
    if(library[mid].getArtist().compareTo(target)<0){
        min = mid+1;
    }
    else if(library[mid].getArtist().compareTo(target)>0){
        max = mid-1;
    }
    else if(library[mid].getArtist().equals(target)){
        index = mid;
        break;
    }
    }
 return index;
}
public int binaryTitleSearch(String target){
 if(!sorted){
 System.out.println("Library not sorted");
 return -1;
}
 int index = Integer.MAX_VALUE;
 int i = library.length - 1;
 while(library[i] == null){
     i--;
    }
 int max = i;
 int min = 0;
 while(min<=max){
    int mid = (min+max)/2;
    if(library[mid].getName().compareTo(target)<0){
        min = mid+1;
    }
    else if(library[mid].getName().compareTo(target)>0){
        max = mid-1;
    }
    else if(library[mid].getName().equals(target)){
        index = mid;
        break;
    }
    }
 return index;
}



}
