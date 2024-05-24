package dataStructuresDesign;

import java.util.*;

/*
Design a data structure that supports insert, delete, search and getRandom in constant time
Time Complexity: O(1) for all operations
 */
public class MyStructure {
    private HashMap<Integer, Integer> values;
    private List<Integer> list;

    public MyStructure() {
        this.values = new HashMap<>();
        this.list = new ArrayList<>();
    }

    public boolean insert(int x) {
        if(!values.containsKey(x)) {
            int size = list.size();
            values.put(x, size);
            list.add(x);
        }

        return false;
    }

    public void remove(int x) {
        if(values.containsKey(x)) {
            int index = values.get(x);
            values.remove(x);

            if(index != list.size() - 1) {
                Collections.swap(list, index, list.size() - 1);
            }

            list.remove(list.size() - 1);
        }
    }

    public int search(int x) {
        return values.getOrDefault(x, -1);
    }

    public int getRandom() {
        if(list.isEmpty()) {
            return -1;
        }

        Random random = new Random();

        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {
        MyStructure ds = new MyStructure();
        ds.insert(10);
        ds.insert(20);
        ds.insert(30);
        ds.insert(40);
        System.out.println(ds.search(30));
        ds.remove(40);
        ds.insert(50);
        System.out.println(ds.search(50));
        System.out.println(ds.getRandom());
    }
}
