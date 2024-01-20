package strategyPattern;

public class ConcerteStrategyMultiply implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
