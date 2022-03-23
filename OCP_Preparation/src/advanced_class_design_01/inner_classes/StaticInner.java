package advanced_class_design_01.inner_classes;

public class StaticInner {

    private int price;

    private static class Nested {
        private int price = 6;
    }

    public static void main(String args[]) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }

}
