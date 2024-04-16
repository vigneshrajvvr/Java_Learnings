import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Subscriber {

    private String title;
    private List<Channel> channels;

    public Subscriber(String title) {
        this.channels = new ArrayList<>();
        this.title = title;
    }

    public void subscribeChannel(Channel channel) {
        channels.add(channel);
    }

    public void unsubscribe(Channel channel) {
        channels.remove(channel);
    }

    public void update(String title) {
        System.out.println("Hey : " + this.title + " Video uploaded : " + title);
    }

}
