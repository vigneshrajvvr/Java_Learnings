package advanced_class_design_01;

public class EnumExample {

   public static void main(String args[]) {
       Season s1 = Season.FALL;
       System.out.println(Season.WINTER);
       System.out.println(s1.name());
       System.out.println(s1 == Season.FALL);

       for(Season temp : Season.values()) {
           System.out.println(temp.name() + " : " + temp.ordinal());
       }

       Season fromStrng = Season.valueOf("SUMMER");
       // throws an exception. As it's a constant it expects exact name of the enum
//       Season fromString1 = Season.valueOf(("summer"));

       // enum cannot be extended
   }

}

enum Season {
    WINTER, SPRING, SUMMER, FALL
}