package SOLID_Principles_Design_Patterns.decoratorDesignPattern;

import java.beans.beancontext.BeanContext;

public class Whip implements Addon {
    Beverage b;

    public Whip(Beverage b) {
        this.b = b;
    }
    @Override
    public void getDescription() {
        b.getDescription();
        System.out.println("Added Whip");
    }

    @Override
    public int getCost() {
        return 23 + b.getCost();
    }
}
