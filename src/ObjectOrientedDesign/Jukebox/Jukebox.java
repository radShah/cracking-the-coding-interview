package ObjectOrientedDesign.Jukebox;

import java.util.ArrayList;
import java.util.jar.Pack200;

/**
 * Created by radha on 10/15/16.
 */
public class Jukebox {
    ArrayList<Album> albums;
    Album currentAlbum = null;
    Song currentSong = null;

    public Jukebox() {
        albums = new ArrayList<>();
    }

    public boolean addAlbum(Album album) {
        if (albums.contains(album)) {
            return false;
        } else {
            albums.add(album);
            return true;
        }

    }

    public ArrayList<Album> displayAlbums() {
        return albums;
    }

    public void selectAlbum(Album album) {
        currentAlbum = album;
    }

    public ArrayList<Song> displaySongs() {
        return currentAlbum.songs;
    }

    public void playSong(Song song) {
        currentSong = song;
    }

    public void stopSong() {
        currentSong = null;
    }
}
