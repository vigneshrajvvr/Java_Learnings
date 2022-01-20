package advanced_class_design_01.access_modifiers.cat;

import advanced_class_design_01.access_modifiers.cat.BigCat;

public class CatAdmirer {

    public static void main(String[] args) {

        BigCat cat = new BigCat();
        System.out.println(cat.name);
        System.out.println(cat.hasFur);
        System.out.println(cat.hasPaws);
//System.out.println(cat.id);id cannot be accessed as it's a private field

    }
}

