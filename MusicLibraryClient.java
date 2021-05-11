
public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Crash", "People", 12, 39.1);
        Album a4 = new Album("Dash", "Mr.coombs", 12, 39.1);
        Album a5 = new Album("Apple", "James", 11, 34.1);
        Album a6 = new Album("Zebra", "Coombs", 13, 49.1);

        myLibrary.add(a1);
        myLibrary.add(a2);

        //System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.doubleSize();

        //System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        
        myLibrary.add(a3);
        myLibrary.add(a4);
        myLibrary.add(a5);
        myLibrary.add(a6);
        myLibrary.remove(0);
        System.out.println(myLibrary);
        

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        myLibrary.searchTitle("Apple");
        myLibrary.searchArtist("one Guy");
        myLibrary.selectionSort();
        System.out.println(myLibrary);
        //myLibrary.binaryArtistSearch("James");
    }
}