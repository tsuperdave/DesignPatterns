package ObserverPattern;

public class Follower implements Observer{

    private String followerName;

    Follower(String followerName) { this.followerName = followerName; }

    public String getFollowerName() {
        return followerName;
    }

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }

    @Override
    public void update(String status) {
        System.out.println(status);
    }

    public void play() {
        // plays something
    }
}
