package SOLID_Principles_Design_Patterns.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<String> videos;
    private List<Subscriber> subscribers;

    private String name;

    public Channel(String name) {
        this.subscribers = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.name = name;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void addVideos(String title) {
        videos.add(title);
        this.notify(title);
    }

    public void notify(String title) {
        for(Subscriber sub : subscribers) {
            sub.update(title);
        }
    }

}
