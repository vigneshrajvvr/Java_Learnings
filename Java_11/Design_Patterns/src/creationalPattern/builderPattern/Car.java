package creationalPattern.builderPattern;

public class Car {

    private int numberOfSeats;
    private String color;
    private String type;

    public static CarBuilder getBuilder() {
        return new CarBuilder();
    }

    public static class CarBuilder {
        private int numberOfSeats;
        private String color;
        private String type;

        public CarBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.type = type;
            car.color = color;
            car.numberOfSeats = numberOfSeats;

            return car;
        }

    }
}
