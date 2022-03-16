package advanced_class_design_01;

public class InitializationBlocks {


    {
        System.out.println("Initialization block");
    }

    static {
        System.out.println("Static initialization block");
    }

    InitializationBlocks() {
        System.out.println("Constructor");
    }

    public static void main(String args[]) {

        InitializationBlocks t = new InitializationBlocks();

    }
}
