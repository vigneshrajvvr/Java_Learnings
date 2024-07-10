package SOLID_Principles_Design_Patterns.decoratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        Beverage b = new Decaf();
        b = new Milk(b);
        b = new Whip(b);

        b.getDescription();
        System.out.println(b.getCost());
    }
}
