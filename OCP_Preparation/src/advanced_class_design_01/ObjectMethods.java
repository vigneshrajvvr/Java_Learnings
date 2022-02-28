package advanced_class_design_01;

import java.util.Objects;

public class ObjectMethods {

    private String objectMethodName;
    private int objectMethodNumber;

    public ObjectMethods(String objectMethodName, int objectMethodNumber) {
        this.objectMethodName = objectMethodName;
        this.objectMethodNumber = objectMethodNumber;
    }

    public static void main(String args[]) {

        ObjectMethods obj1 = new ObjectMethods("toString()", 1);
        System.out.println(obj1.toString());
    }

    // overridden from Object class
    @Override
    public String toString() {
        return this.objectMethodName + " " + this.objectMethodNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectMethods)) return false;
        ObjectMethods that = (ObjectMethods) o;
        return objectMethodNumber == that.objectMethodNumber && Objects.equals(objectMethodName, that.objectMethodName);
    }

    /*
        - Hashcode must not change
        - if equals method return true then hashcode method also should return true
        - if equals method return false then the results need not be necessarily be unique
     */
    @Override
    public int hashCode() {
        return Objects.hash(objectMethodName, objectMethodNumber);
    }
}
