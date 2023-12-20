public interface Defaultable {

    String abstractValue = "ABSTRACT";

    void abstractMethod();

    default void defaultNotAbstractMethod() {
        System.out.println("Testing Default");
    }

}

// Class implements Defaultable interface
class ImplementingClass implements  Defaultable {

    @Override
    public void abstractMethod() {
        System.out.println("ImplementingClass" +
                " implements interface's abstract method");
    }
}

// Class which uses the interface in a method as a parameter type.
class DefaultClass extends BaseClass implements Defaultable{

    public static void main(String args[]) {

        // Instantiate the current class.
        DefaultClass dc = new DefaultClass();

        // Pass instance of implementing class to method using interface
        dc.callAbstractMethod(new ImplementingClass());

        // Pass lambda expression to method using interface
        dc.callAbstractMethod(() -> System.out.println("Lambda Expression" +
                " implements interface's abstract method"));

        // Call method directly
        dc.abstractMethod();

    }

    // Method has a parameter of type Defaultable
    public void callAbstractMethod(Defaultable d) {
        // Execute implementing object's abstractMethod
        d.abstractMethod();
    }

    @Override
    public void abstractMethod() {
        defaultNotAbstractMethod();
    }
}

// Create a base class that has method with same signature default
// method in interface
class BaseClass {
    public void defaultNotAbstractMethod() {
        System.out.println("Testing defaultNotAbstractMethod on class");
    }
}