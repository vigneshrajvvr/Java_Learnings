package advanced_class_design_01.enums;

/*
    enum can have abstract methods which needs to be overridden by all the enum constants in it
 */
public enum Season2 {

    WINTER {
        @Override
        public void printHours() {
            System.out.println("9am-3pm");
        }
    }, SPRING {
        @Override
        public void printHours() {
            System.out.println("9am-5pm");
        }
    }, SUMMER {
        @Override
        public void printHours() {
            System.out.println("9am-7pm");
        }
    }, FALL {
        @Override
        public void printHours() {
            System.out.println("9am-5pm");
        }
    };

    public abstract void printHours();

}
