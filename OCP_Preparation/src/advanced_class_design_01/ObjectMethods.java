package advanced_class_design_01;

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

    @Override
    public String toString() {
        return this.objectMethodName + " " + this.objectMethodNumber;
    }

}
