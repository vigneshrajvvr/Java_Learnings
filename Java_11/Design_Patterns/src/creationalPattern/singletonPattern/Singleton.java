package creationalPattern.singletonPattern;

public final class Singleton {

    private static  Singleton singleton;

    private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(singleton == null) {
            singleton = new Singleton(value);
        }

        return singleton;
    }

    public String getValue() {
        return this.value;
    }

}
