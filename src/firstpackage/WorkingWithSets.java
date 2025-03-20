package firstpackage;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set <Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(14);
        System.out.println(mySet);

        Set <String> names = new HashSet<>();
        names.add("Nathan");
        names.add("Vivian");
        names.add("Chela");
        System.out.println(names);


        for (String name : names ){
            System.out.println(name);
        }
    }
}
