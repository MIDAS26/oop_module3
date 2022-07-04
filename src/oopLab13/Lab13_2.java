package oopLab13;

public class Lab13_2 {


    public static <T> void minMax(Comparable<T>[] numbers) {
        T max = (T) numbers[0];
        T min = (T) numbers[0];


        for (Comparable<T> number : numbers) {
            if (number.compareTo(max) > 0) {
                max = (T) number;
            }
        }
        System.out.println(max);

        for (Comparable<T> number : numbers) {
            if (number.compareTo(min) < 0) {
                min = (T) number;
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Integer[] num = {1,3,4,5,6};
        Double[] doubles = {1.2, 2.4, 6.7};

        minMax(num);
        minMax(doubles);
    }

}
