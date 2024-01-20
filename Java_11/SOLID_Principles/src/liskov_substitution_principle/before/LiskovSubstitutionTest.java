package liskov_substitution_principle.before;

public class LiskovSubstitutionTest {

    public static void main(String args[]) {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(2);
        rectangle.setWidth(5);

        if(rectangle.getArea() == 10) {
            System.out.println(rectangle.getArea());
        }

        // Same assumption does not hold for Square
        Rectangle square = new Square();
        square.setHeight(2);
        square.setWidth(5);

        if(square.getArea() == 10) {
            System.out.println(square.getArea());
        }
    }

}
