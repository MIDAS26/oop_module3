package oopLab14;

import java.util.Scanner;

public class Calc implements Functions{
    @Override
    public Double fun1(Double x) {
        return 4 * x - 1;
    }

    @Override
    public Double fun2(Double x) {
        return 25 * x + 10;
    }

    @Override
    public Double fun3(Double x) {
        return 0.0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double x =  in.nextDouble();
        Calc calc = new Calc();

        if (x < 0 )
            System.out.println(calc.fun1(x));
        else if (x > 0)
            System.out.println(calc.fun2(x));
        else
            System.out.println(calc.fun3(x));

    }

}
