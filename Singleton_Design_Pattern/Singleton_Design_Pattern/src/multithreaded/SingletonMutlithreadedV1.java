package multithreaded;

public class SingletonMutlithreadedV1 {

    private static SingletonMutlithreadedV1 instance = new SingletonMutlithreadedV1();

    private SingletonMutlithreadedV1(){}

    private static SingletonMutlithreadedV1 getInstance() {
        return instance;
    }
}
