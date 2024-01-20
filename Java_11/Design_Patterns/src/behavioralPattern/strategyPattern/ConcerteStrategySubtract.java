package behavioralPattern.strategyPattern;

public class ConcerteStrategySubtract implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}
