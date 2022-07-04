package oopLab15;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.function.Predicate;

public class Lab15_3 {

    public static void main(String[] args) {
        try {

            Predicate<Integer> pr = a -> (a % 2 == 0);

            Scanner in = new Scanner(System.in);
            System.out.println("Input x: ");
            int x = in.nextInt();

            if (pr.test(x)) {
                System.out.println("Число парне");
            } else {
                System.out.println("Число не парне");
            }
        } catch (IllegalStateException  e) {
            System.out.println("Restart pls");
        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("Enter integer number");
        }
    }

}
