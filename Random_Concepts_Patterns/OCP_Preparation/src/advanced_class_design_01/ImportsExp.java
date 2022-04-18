package advanced_class_design_01;

import java.util.List;
import java.util.ArrayList;
// instead we can use import java.util.*;

// as sort is static method we have to use static imports
import static java.util.Collections.sort;
// instead we can use import static java.util.Collections.*;

public class ImportsExp {

    public static void main(String args[]) {

        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("acd");
        sort(list);

    }

}
