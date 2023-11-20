import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Song {
    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
    public String toString() {
        return "Song: " + title + " by " + artist;
    }
}

class musiclibrary {
    private List<Song> songs;

    public musiclibrary() {
        this.songs = new ArrayList<Song>();
    }

    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        songs.add(newSong);
        System.out.println("Added song: " + newSong);
    }

    public void removeSong(String title, String artist) {
        Song songToRemove = new Song(title, artist);
        if (songs.remove(songToRemove)) {
            System.out.println("Removed song: " + songToRemove);
        } else {
            System.out.println("Song not found: " + songToRemove);
        }
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library. Add some songs first.");
        } else {
            Random random = new Random();
            int randomIndex = random.nextInt(songs.size());
            Song randomSong = songs.get(randomIndex);
            System.out.println("Now playing: " + randomSong);
        }
    }

    public static void main(String[] args) {
        musiclibrary myLibrary = new musiclibrary();

        myLibrary.addSong("Shape of You", "Ed Sheeran");
        myLibrary.addSong("Someone Like You", "Adele");
        myLibrary.addSong("Despacito", "Luis Fonsi");

        myLibrary.playRandomSong();

        myLibrary.removeSong("Someone Like You", "Adele");

        myLibrary.playRandomSong();
    }
}
