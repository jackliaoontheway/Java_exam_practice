public class Unit3 {

    public static void main(String[] args) {
        n37();
    }

    public static void n37() {
//        int sum = fibonacci(1, 1, 10);
        //fibonacci2();
        System.out.println(fibonacci3(1,1,6));
//        System.out.println(sum);
    }

    private static int fibonacci3(int a, int b, int c) {
        if (c == 1) {
            return b;
        }
        int temp = a;
        a = a + b;
        b = temp;

        return fibonacci3(a, b, --c);
    }

    private static void fibonacci2() {
        int f1 = 1, f2 = 1, f;
        for (int i = 3; i <= 6; i++) {
            f = f2;
            f2 = f1 + f2;
            f1 = f;
        }
        System.out.println(f2);
    }

    private static int fibonacci(int sum, int i, int month) {
        if (month == 0) {
            return sum;
        }
        if (i < 3) {
            return fibonacci(sum, i + 1, month - 1);
        }
        return fibonacci(sum, i + 1, month - 1) + fibonacci(1, 1, month);
    }


}
