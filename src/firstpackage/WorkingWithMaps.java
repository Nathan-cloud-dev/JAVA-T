package firstpackage;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map <String, Integer> nameAge = new HashMap<>();
        nameAge.put("Nathan",25);
        nameAge.put("Sly",23);
        nameAge.put("Manu",22);
        nameAge.put("Chela",24);
        System.out.println(nameAge);
        System.out.println(nameAge.get("Nathan"));

        for (Map.Entry<String,Integer> entry: nameAge.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        for (String name:nameAge.keySet()){
            System.out.println(name);

        }
// *************************MANIPULATING MAPS****************************
        nameAge.remove("Nathan");
        System.out.println(nameAge);

        nameAge.put("Kevin",29);
        System.out.println(nameAge);
    }
}
