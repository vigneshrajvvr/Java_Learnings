package interface_segregation_principle.before;

public class DeloRean implements Car{
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
        // Travels back to the past
    }

    @Override
    public void backToTheFuture() {
        // Travels to the future
    }
}
