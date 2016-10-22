package ObjectOrientedDesign.Jukebox;

import java.util.ArrayList;

/**
 * Created by radha on 10/15/16.
 */
public class JukeboxSimulation {

    public static Jukebox getInitializedJukebox() {
        Jukebox jukebox = new Jukebox();
        Album album = new Album();
        album.name = "Michelle's World";
        album.addSong(new Song(new Artist("Michelle Branch"),"Everything" ));
        album.addSong(new Song(new Artist("Michelle Branch"),"Breathe" ));
        album.addSong(new Song(new Artist("Michelle Branch"),"Turn it inside out." ));
        jukebox.addAlbum(album);
        return jukebox;

    }


    public static void main (String [] args) {
        Jukebox jukebox = JukeboxSimulation.getInitializedJukebox();
        System.out.println("Got a new juke box");
        ArrayList<Album> albums = jukebox.displayAlbums();
        jukebox.selectAlbum(albums.get(0));
        System.out.println("Selected album " + jukebox.currentAlbum.name);
        ArrayList<Song> songs = jukebox.displaySongs();
        jukebox.playSong(songs.get(0));
        System.out.println("Playing " + jukebox.currentSong.name);
        jukebox.stopSong();
        jukebox.playSong(songs.get(1));
        System.out.println("Playing " + jukebox.currentSong.name);
        jukebox.playSong(songs.get(1));
    }

}
