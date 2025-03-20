package firstpackage;

import java.util.*;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<String> strings = new ArrayDeque<>();

        strings.add("JAVA");
        strings.add("PYTHON");
        strings.add("C#");

        System.out.println(strings);
        strings.remove("JAVA");
        System.out.println(strings);
        strings.add("JAVA");
        System.out.println(strings);
        strings.peek();
        System.out.println(strings);
    }
}
