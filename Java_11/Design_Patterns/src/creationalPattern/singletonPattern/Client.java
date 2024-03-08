package creationalPattern.singletonPattern;

public class Client {

    public static void main(String[] args) {

        Singleton object1 = Singleton.getInstance("Test 1");

        Singleton object2 = Singleton.getInstance("Test 2");

        // Both the reference points to same object resulting in the same value
        System.out.println(object1.getValue() + " " + object2.getValue());

    }

}
