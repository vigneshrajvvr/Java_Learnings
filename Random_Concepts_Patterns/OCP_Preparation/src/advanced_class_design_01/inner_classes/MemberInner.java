package advanced_class_design_01.inner_classes;

/*
    member inner class
 */
public class MemberInner {

    private String greeting = "Hi";

    /*
        inner class can be public, default, protected and private
        it can access all private members of outer class
     */
    protected class Inner {

        public int repeat = 3;

        public void go() {

            for(int i = 0; i < repeat; i++) {
                System.out.println(greeting);
            }

        }

    }

    private void callInner() {

        Inner inner = new Inner();

        inner.go();

    }

    public static void main(String args[]) {

        MemberInner outer = new MemberInner();

        outer.callInner();

        Inner inner = outer.new Inner();

        /*
            InnerClass1.Inner innerInstance = outer.new Inner();
            another way of instantiating inner class
         */

        inner.go();

    }

}
