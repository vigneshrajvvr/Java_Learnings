package behavioralPattern.strategyPattern;

public class Client {

    public static void main(String args[]) {

        Strategy add = new ConcereteStrategyAdd();
        Context context = new Context(add);
        System.out.println("Addition: " + context.executeStrategy(5, 10));

        Strategy subtract = new ConcerteStrategySubtract();
        context = new Context(subtract);
        System.out.println("Subtraction: " + context.executeStrategy(5, 10));

        Strategy multiply = new ConcerteStrategyMultiply();
        context = new Context(multiply);
        System.out.println("Multiplication : " + context.executeStrategy(5, 10));
    }

}
