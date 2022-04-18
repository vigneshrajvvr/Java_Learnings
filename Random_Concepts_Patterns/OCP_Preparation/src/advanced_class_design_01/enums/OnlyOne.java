package advanced_class_design_01.enums;

public enum OnlyOne {

    ONCE(true);

    private OnlyOne(boolean b) {
        System.out.println("Executing...");
    }

}
