package liskov_substitution_principle.after;

import liskov_substitution_principle.before.Rectangle;

public class LiskovSubstitutionTest {

    public static void main(String args[]) {
        liskov_substitution_principle.after.Rectangle rectangle = new liskov_substitution_principle.after.Rectangle();
        rectangle.setHeight(2);
        rectangle.setWidth(5);

        if(rectangle.area() == 10) {
            System.out.println(rectangle.area());
        }

        liskov_substitution_principle.after.Square square = new Square();
        square.setSize(5);

        if(square.area() == 25) {
            System.out.println(square.area());
        }
    }

}
