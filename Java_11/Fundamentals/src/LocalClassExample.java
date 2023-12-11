/*
The Learn Programming Academy
Java SE 11 Developer 1Z0-819 OCP Course - Part 2
Section 1: Java Fundamentals
Topic:  Local Classes
*/

public class LocalClassExample {
    private String defaultName = "Jane";
    private String lastName = "Doe";
    // Creating a non-static method that declares a local class
    private void methodWithLocalClass() {
        String defaultName = "Ralph";
        // LocalClass Only has scope within this method
        class LocalClass {
            // local class can have all the same members as an outer class
            // (with the exception of static members).
            private String name;

            // Constructor on local class
            private LocalClass(String name) {
                if(name == null) {
                    this.name = defaultName;
                } else {
                    this.name = name;
                }
                this.name += " " + LocalClassExample.this.lastName;
            }

            private void performSomeAction() {
                System.out.println("LocalClass.name = " + name);

            }
        }

        // Create multiple instances of local class within
        // the enclosing code's scope..
        LocalClass jeff = new LocalClass("Jeff");
        LocalClass martha = new LocalClass("Martha");
        LocalClass bob = new LocalClass("Bob");

        // Execute methods on instances of the local class
        jeff.performSomeAction();
        martha.performSomeAction();
        bob.performSomeAction();

        // Access fields directly from instance of local class
        System.out.println("Bob's name is: " + bob.name);

        new LocalClass(null).performSomeAction();
    }

    public static void main(String[] args) {
        new LocalClassExample().methodWithLocalClass();
    }
}
