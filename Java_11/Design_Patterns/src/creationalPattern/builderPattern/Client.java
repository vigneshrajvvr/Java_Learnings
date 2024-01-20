package creationalPattern.builderPattern;

public class Client {
    public static void main(String args[]) {

        Car car = Car.getBuilder()
                .setColor("Blue")
                .setNumberOfSeats(6)
                .setType("Automatic")
                .build();

        Car newCar = Car.getBuilder()
                .setColor("Blue")
                .setType("Automatic")
                .build(); 

    }

}
