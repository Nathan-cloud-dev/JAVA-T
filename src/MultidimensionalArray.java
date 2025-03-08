import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int [][] numbers = {{1,3,4,5,2,6,8,9},{4,3,5,2,1,57,8}};


        for (int [] myNumber:numbers){

            for (int num2:myNumber)

                System.out.println(num2);
        }
        Arrays.stream(numbers).forEach(System.out::println);
    }

}
