package oopLab13;

public class Lab13_1 {
    static <T> void swap(T lhs, T rhs) {
        T temp = lhs;
        lhs = rhs;
        rhs = temp;
    }
    public static void main(String[] args) {
        String a = "qqwe";
        String b = "qrtywu";
        swap(a, b);
        System.out.println("a= " + a + " b=" + b);

        double a1 = 23;
        double b1 = 345;
        swap(a1, b1);
        System.out.println("a= " + a1 + " b=" + b1);
    }
}
