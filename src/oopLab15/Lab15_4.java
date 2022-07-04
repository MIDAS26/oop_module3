package oopLab15;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lab15_4 {
    public static void main(String[] args) {
        try {
            Function function;
            function = (x -> {
                if (x == 0 || x == 1) {
                    System.out.println(1);
                } else if (x > 1) {
                    int n0 = 1;
                    int n1 = 1;
                    int n2;
                    for (int i = 3; i <= x; i++) {
                        n2 = n0 + n1;
                        n0 = n1;
                        n1 = n2;
                        if (i == x) {
                            System.out.println(n2);
                        }
                    }
                } else
                    System.out.println("Input correct integer");
            });

            Scanner in = new Scanner(System.in);
            System.out.println("Input x: ");
            int x = in.nextInt();

            function.function(x);
        } catch (IllegalStateException  e) {
            System.out.println("Restart pls");
        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("Enter integer number");
        }
    }

    interface Function {
        void function(int x);
    }
}
