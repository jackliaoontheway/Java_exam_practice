public class Unit1 {


    public static void main(String[] args) {
        new Unit1().expressTest();
    }

    /**
     * 主要考 运算符的优先级
     * % 的优先级要大于 >>
     *
     * >> 计算方法
     * c >> 1, 即c / 2
     * c >> 2, 即c = c / 2, c = c / 2; 即位移n 则左边 / n 次 2
     */
    void expressTest() {
        int a = 1,b = 3,c = 6,d;
        d = (a + b * 3) % c >> 1;
        System.out.print(d);
    }

    /**
     * 程序设计题 37
     * 主要考 运算后，表达式会自动转型为double类型
     * double 类型赋值给int 类型需要强制转换
     */
    private void convertDoubleToInt() {
        int a = 2,b = 9,d;
        double c = 1.6;
        d = (int) (a * b - c);
    }

    private void printTrueOrFalse() {
        boolean b1 = false,b2 = false;
        System.out.print(b1 ? "one" : "two");
        if(!b1 && b2) {
            System.out.print("one");
        } else {
            System.out.print("two");
        }

        if(!b1 && b2) {
            System.out.print("one");
        } else if(!b1 && !b2) {
            System.out.print("two");
        } else {
            System.out.print("three");
        }
    }

}
