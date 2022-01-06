package access_modifiers.cat.species;

import access_modifiers.cat.BigCat;

public class Lynx extends BigCat{

    public static void main(String[] args) {

        BigCat cat = new BigCat();
//        System.out.println(cat.name);
//        System.out.println(cat.hasFur);
//        System.out.println(cat.hasPaws);
//        System.out.println(cat.id);
//        Can't be accessed as it uses reference of BigCat class. Protected variable can be accessed by the child class reference


    }

}

