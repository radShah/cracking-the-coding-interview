package ObjectOrientedDesign.Jukebox;

import java.util.ArrayList;

/**
 * Created by radha on 10/15/16.
 */
public class Album {

    String name;
    ArrayList<Song> songs;

    public Album() {
        songs = new ArrayList();
    }

    public boolean addSong(Song song) {
        if (songs.contains(song)) {
            return false;
        } else {
            songs.add(song);
            return true;
        }
    }
}
