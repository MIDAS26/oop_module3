package oopLab13;

public class Lab13_3 {
    static class Test<T> {
        Comparable<T> t1;
        Comparable<T> t2;

        public Test(Comparable<T> t1, Comparable<T> t2) {
            this.t1 = t1;
            this.t2 = t2;
        }

        public void min() {
            if (t1.compareTo((T) t2) > 0) {
                System.out.println(t2);
            } else {
                System.out.println(t1);
            }
        }
    }

    public static void main(String[] args) {
        Test<Integer> num = new Test<Integer>(2, 3);
        num.min();
    }
}
