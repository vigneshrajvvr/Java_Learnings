package multithreaded;

import singlethreaded.SingletonSingleThreaded;

public class SingletonMultithreadedV2 {
    private static SingletonMultithreadedV2 instance;

    private SingletonMultithreadedV2() {}

    private static synchronized SingletonMultithreadedV2 getInstance() {
        if(instance != null) {
            instance = new SingletonMultithreadedV2();
        }

        return instance;
    }
}
