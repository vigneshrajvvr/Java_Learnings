package access_modifiers.mouse;

import access_modifiers.cat.BigCat;

public class Mouse {

    public static void main(String[] args) {

        BigCat cat = new BigCat();
        System.out.println(cat.name);
//        System.out.println(cat.hasFur);
//        System.out.println(cat.hasPaws);
//        System.out.println(cat.id);
//        All these instance variables can't be accessed as they doesn't have proper access modifier

    }
}
