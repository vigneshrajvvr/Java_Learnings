package SOLID_Principles_Design_Patterns.commandDesignPattern;

public class Invoker {
    private Icommand icommand;

    public Invoker() {
    }

    public void setIcommand(Icommand icommand) {
        this.icommand = icommand;
    }

    public void pressButton() {
        icommand.execute();
    }
}
