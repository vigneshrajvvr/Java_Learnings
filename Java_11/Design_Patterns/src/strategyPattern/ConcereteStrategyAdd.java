package strategyPattern;

public class ConcereteStrategyAdd implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
