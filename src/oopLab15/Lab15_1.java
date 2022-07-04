package oopLab15;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lab15_1 {

    public static void main(String[] args) {
        try {
            Function function1;
            function1 = (x) -> 4 * x - 1;

            Function function2;
            function2 = (x) -> 25 * x + 10;

            Scanner in = new Scanner(System.in);
            System.out.println("Input x: ");
            double x = in.nextDouble();

            double result;
            if (x <= 0) {
                result = function1.function(x);
            } else {
                result = function2.function(x);
            }
            System.out.println(result);
        } catch (IllegalStateException  e) {
            System.out.println("Restart pls");
        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("Enter integer number");
        }
    }


    interface Function {
        double function( double x);
    }
}
