package CompositePattern;

import java.util.ArrayList;

public class Playlist implements IComponent{

    String playlistName;
    ArrayList<IComponent> playlist = new ArrayList<>();

    Playlist(String playlistName) { this.playlistName = playlistName; }

    @Override
    public void play() {
        System.out.println(this.playlistName + " playlist is now playing");
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for(IComponent comp: playlist){
            comp.setPlaybackSpeed(speed);
        }
        System.out.println("Playback speed for playlist \"" + playlistName + "\" has been set to " + speed + ".");
    }

    @Override
    public String getName() {
        System.out.println("Playlist name is " + this.playlistName);
        return this.playlistName;
    }

    void add(IComponent component) {
        System.out.println("Added " + component.getName() + " to playlist " + this.playlistName);
        playlist.add(component);
    }

    void remove(IComponent component) {
        System.out.println("Removed " + component.getName() + " from playlist " + playlistName);
        playlist.remove(component);
    }

}

