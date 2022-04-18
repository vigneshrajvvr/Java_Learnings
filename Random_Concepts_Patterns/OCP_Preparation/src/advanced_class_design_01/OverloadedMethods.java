package advanced_class_design_01;

public class OverloadedMethods {
    public static void main(String args[]) {
        //Overloaded methods
        OverloadedMethods old = new OverloadedMethods();
        old.fly(1, 2);
    }

    //Match by exact type
    public void fly(int a, int b) {

    }

    //Match by larger primitive type
    public void fly(long a, long b) {

    }

    //Match by autoboxed type
    public void fly(Integer a, Integer b) {

    }

    //Match by varargs
    public void fly(int... a) {

    }
}
