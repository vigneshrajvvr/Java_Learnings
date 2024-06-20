package SOLID_Principles_Design_Patterns.observerDesignPattern;

public class Client {

    public static void main(String args[]) {
        Channel channel = new Channel("Vlogger");

        Subscriber subscriber1 = new Subscriber("Ram1");
        Subscriber subscriber2 = new Subscriber("Ram2");
        Subscriber subscriber3 = new Subscriber("Ram3");
        Subscriber subscriber4 = new Subscriber("Ram4");

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);
        channel.subscribe(subscriber4);

        subscriber1.subscribeChannel(channel);
        subscriber2.subscribeChannel(channel);
        subscriber3.subscribeChannel(channel);
        subscriber4.subscribeChannel(channel);

        channel.addVideos("Vlogging video 1");


    }

}
