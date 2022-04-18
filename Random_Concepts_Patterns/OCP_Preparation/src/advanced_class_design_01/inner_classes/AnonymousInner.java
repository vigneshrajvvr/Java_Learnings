package advanced_class_design_01.inner_classes;

public class AnonymousInner {
/*
    abstract class SaleTodayOnly {
        abstract int dollarsOff();
    }
 */

    private interface SaleTodayOnly {
        abstract int dollarsOff();
    }

    public int admission(int basePrice, SaleTodayOnly sales) {

        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        };

        return basePrice - sale.dollarsOff();

    }

    public int pay() {
        return admission(10, new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                return 3;
            }
        });
    }

    public static void main(String args[]) {

        AnonymousInner anon = new AnonymousInner();
//        System.out.println(anon.admission(10), );

    }

}
