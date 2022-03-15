package advanced_class_design_01.enums;

public class EnumExample {

   public static void main(String args[]) {
       Season s1 = Season.FALL;
       System.out.println(Season.WINTER);
       System.out.println(s1.name());
       System.out.println(s1 == Season.FALL);

       for (Season temp : Season.values()) {
           System.out.println(temp.name() + " : " + temp.ordinal());
       }

       Season fromStrng = Season.valueOf("SUMMER");
       // throws an exception. As it's a constant it expects exact name of the enum
//       Season fromString1 = Season.valueOf(("summer"));

       // enum cannot be extended

       // enum in switch case
       Season summer = Season.SUMMER;
       switch (summer) {
           case WINTER: // Season.WINTER cannot be used - compilation error
               System.out.println("It's Winter season");
               break;
           case SUMMER:
               System.out.println("It's Summer season");
               break;
           default:
               System.out.println("It's not a season");
       }

       Season1.SUMMER.printExpectedVisitors();

       /*
       writes constructing only once
       Java constructs enums when they are first called. After that, Java just returns already-constructed values
        */
       OnlyOne one = OnlyOne.ONCE;
       OnlyOne two = OnlyOne.ONCE;


   }

}

enum Season {
    WINTER, SPRING, SUMMER, FALL
}