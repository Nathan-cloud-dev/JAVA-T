package firstpackage;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("eggs");
        myList.add("milk");
        myList.add("sugar");

        List <Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(myList);
        System.out.println(numbers);
//                      MANIPULATING LIST.
        System.out.println(myList.get(0));
        myList.remove("sugar");
        boolean containsSugar= myList.contains("sugar");
        System.out.println(containsSugar);
    }


}
