package ObserverPattern;

import java.util.ArrayList;

public class Channel implements Subject{

    private ArrayList<Observer> observerList = new ArrayList<>();
    private String channelName;
    private String status;

    Channel() { }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void notifyObservers() {
        for(Observer observer: observerList) {
            observer.update(status);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {

    }
}
