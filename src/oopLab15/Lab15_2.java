package oopLab15;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lab15_2 {

    public static void main(String[] args) {
        try {
            Function function;
            function = ((x, y) -> {
                if (x > y) {
                    System.out.println("bigger: " + x + "; " + "smaller: " + y);
                } else if (x < y) {
                    System.out.println("bigger: " + y + "; " + "smaller: " + x);
                } else
                    System.out.println("x = y");
            });

            Scanner in = new Scanner(System.in);
            System.out.println("Input x: ");
            double x = in.nextDouble();
            System.out.println("Input y: ");
            double y = in.nextDouble();


            function.function(x, y);
        } catch (IllegalStateException  e) {
            System.out.println("Restart pls");
        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("Enter integer number");
        }
    }

    interface Function {
        void function(double x, double y);
    }
}
