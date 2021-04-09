package ObserverPattern;

public class Follower implements Observer{

    private String followerName;

    Follower() { }

    @Override
    public void update(String status) {
        System.out.println(status);
    }

    public void play() {

    }
}
