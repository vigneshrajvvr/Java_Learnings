package interface_segregation_principle.before;

public class Mustang implements Car {
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
        // because mustang cannot go back to the past!
        throw new UnsupportedOperationException();
    }

    @Override
    public void backToTheFuture() {
        // because mustang cannot go back to the present!
        throw new UnsupportedOperationException();
    }
}
