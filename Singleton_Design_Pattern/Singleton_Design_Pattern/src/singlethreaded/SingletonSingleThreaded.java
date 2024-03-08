package singlethreaded;

public class SingletonSingleThreaded {

    private static  SingletonSingleThreaded instance;

    private SingletonSingleThreaded() {}

    private static SingletonSingleThreaded getInstance() {
        if(instance != null) {
            instance = new SingletonSingleThreaded();
        }

        return instance;
    }
}
