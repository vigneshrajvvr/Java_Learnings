package interface_segregation_principle.after;

public class DeloRean implements Car, TimeMachine {
    @Override
    public void startEngine() {
        // Start engine...
    }

    @Override
    public void accelerate() {
        // Accelerate...
    }

    @Override
    public void backToThePast() {
        // Travel back to the past
    }

    @Override
    public void backToTheFuture() {
        // Travel to the future
    }
}
