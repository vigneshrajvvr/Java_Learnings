package strategyPattern;

public class Context {

    private Strategy strategy;

    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }

}
