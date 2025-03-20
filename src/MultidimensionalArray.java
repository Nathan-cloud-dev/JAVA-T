import java.util.Arrays;
import java.util.Iterator;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] numbers = {{1,3,4,5,2,6,8,9},{4,3,5,2,1,57,8}};
        Arrays.stream(numbers).flatMapToInt(Arrays::stream).forEach(System.out::println);$

//        Iterator<int []> it = Arrays.stream(numbers).iterator();
//        while (it.hasNext()){
//            System.out.println(Arrays.toString(Arrays.stream(it.next()).toArray()));
//        }


//
//        for (int [] myNumber:numbers){
//
//            for (int num2:myNumber)
//
//                System.out.println(num2);
//        }
//
    }

}
