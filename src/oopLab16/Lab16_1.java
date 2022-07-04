package oopLab16;

import java.util.ArrayList;
import java.util.List;

public class Lab16_1 {
    public static void main(String[] args) {
       Function function1;
       function1 = (x -> {
           List<Integer> posArr = new ArrayList<>();
           for (int j : x) {
               if (j >= 0) {
                   posArr.add(j);
               }
           }
           System.out.println("Positive numbers");
           posArr.forEach(System.out::println);
       });

        Function function2;
        function2 = (x -> {
            List<Integer> negArr = new ArrayList<>();
            for (int j : x) {
                if (j < 0) {
                    negArr.add(j);
                }
            }
            System.out.println("Negative numbers");
            negArr.forEach(System.out::println);
        });

       int[] arr = {1, 2 ,3 ,4, 5, 23, -12, 4, -215, 53, -85, 2, -541};

       function1.function(arr);
       function2.function(arr);
    }

    interface Function {
        void function( int[] x);
    }
}
