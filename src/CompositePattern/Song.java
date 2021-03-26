package CompositePattern;

public class Song implements IComponent{

    String songName;
    String artist;
    float speed = 1; // Default speed

    Song(String songName, String artist) {this.songName = songName; this.artist = artist; }

    @Override
    public void play() {
        System.out.println(this.songName + " is now playing");
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        System.out.println("Playback speed for song \"" + this.songName + "\" has been set to " + speed + ".");
        this.speed = speed;
    }

    @Override
    public String getName() {
        System.out.println("Song name is " + this.songName);
        return this.songName;
    }

    String getArtist() {
        System.out.println("Artist name is " + this.artist);
        return this.artist;
    }
}