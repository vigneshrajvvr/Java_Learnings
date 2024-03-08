package multithreaded;

public class SingletonMultithreadedV3 {
    private static SingletonMultithreadedV3 instance;

    private SingletonMultithreadedV3() {}

    private static SingletonMultithreadedV3 getInstance() {
        if(instance != null) {
            synchronized (SingletonMultithreadedV3.class) {
                if(instance != null) {
                    instance = new SingletonMultithreadedV3();
                }
            }
        }

        return instance;
    }
}
