package oopLab14;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lab14_3 implements CalcOperations {

    @Override
    public double plus(double a, double b) {
        return a + b;
    }

    @Override
    public double minus(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            Lab14_3 operations = new Lab14_3();
            Scanner in = new Scanner(System.in);
            System.out.println("Input a: ");
            double a = in.nextDouble();
            System.out.println("Input operator(+, -, *, :, /): ");
            String operation = in.next();
            System.out.println("Input b: ");
            double b = in.nextDouble();


            switch (operation) {
                case "+":
                    System.out.println(operations.plus(a, b));
                    break;
                case "-":
                    System.out.println(operations.minus(a, b));
                    break;
                case "*":
                    System.out.println(operations.multiply(a, b));
                    break;
                case "/":
                case ":":
                    System.out.println(operations.divide(a, b));
                    break;
                default:
                    System.out.println("Invalid Operator!");
            }
        } catch (IllegalStateException  e) {
            System.out.println("Restart pls");
        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("Enter correct operator");
        }

    }
}
