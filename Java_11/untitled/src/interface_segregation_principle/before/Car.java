package interface_segregation_principle.before;

public interface Car {

    void startEngine();
    void accelerate();
    void backToThePast(); // Method specific to DeloRean
    void backToTheFuture(); // Method specific to DeloRean

}
