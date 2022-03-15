package advanced_class_design_01.enums;
/*
    enum can have constructors
 */
public enum Season1 {

    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Meidum");

    private String expectedVisitors;

    private Season1(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors() {
        System.out.println(this.expectedVisitors);
    }

}
