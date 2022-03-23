package advanced_class_design_01.inner_classes;

import javafx.fxml.LoadException;

/*
    local inner class
 */
public class LocalInner {

    private int length = 5;

    public void calculate() {

        /*(
            Local variables should be final or effectively final
         */
        final int width = 4;
        int test = 6;

        /*
            member inner classes do not have access specifier
         */
        class Inner {
            public void multiply() {
                System.out.println(length * width);
            }
        }

        Inner inner = new Inner();
        inner.multiply();

    }

    public static void main(String args[]) {

        LocalInner outer = new LocalInner();
        outer.calculate();

    }

}
