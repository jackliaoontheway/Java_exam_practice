import java.io.*;

public class Unit2 {


    public static void main(String[] args) {
        n32();
        n34();
    }

    private static void n2() {
        //正确声明变量
        // int a; ok
        // int a,char b;
        // int a,b
        // int a = 'c';
    }

    private static void n9() {
        // 对话框时顶层容器
        //先创建窗口再创建对话框
        //对话框依赖窗口
        //强制对话框再关闭之前，其他窗口无法接收任何形式的输入
    }

    private static void n17() throws FileNotFoundException {
        // 字节流和字符流的中介
        InputStreamReader reader = new InputStreamReader(new FileInputStream(new File("")));
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(new File("")));
    }

    private static void n18() throws FileNotFoundException {
        // Java 中可以调用 interrupt 方法 中断线程
        // 新建 start
        // 运行 run
        // 阻塞 sleep wait
        // 中断线程 interrupt   yield 强制终止线程的执行
        // 四种状态 新建 可运行 死亡 阻塞

        // 线程时进程执行过程中产生的多条执行线索，
        // 比进程单位更小的执行单位，
        // 线程在形式上同进程十分相似，都是用一个按需执行的语句序列来完成特定的功能，
        // 不同的是线程没有入口，也没有出口，
        // 自身不能自动运行，必须栖身于某个进程中，由进程触发执行，并且属于同一进程的线程共享该进程的系统资源
    }

    private static void n27() throws FileNotFoundException {
        float a = 6.8f;
        int c;
        c = (int)a;
    }

    private static void n30() throws IOException {

        File inFile = new File("C:\\text.txt");
        File outFile = new File("C:\\my.txt");
        FileInputStream fis = new FileInputStream(inFile);
        FileOutputStream fos = new FileOutputStream(outFile);
        int c ;
        while( (c = fis.read()) != -1) {
            fos.write(c);
        }
        fos.flush();
        fis.close();
        fos.close();

    }

    private static void n32()  {
        int a = 1, b , c;
        a = b = a ++; // a = 1,b = 1; // a = b = 1;g
        c = a +++ b; // 这里 a++ 的优先级要高于 +  所以 a++ 先执行 然后再 + b
        System.out.println(a);
        System.out.println(b);

    }

    private static void n34()  {
        String str = "public static void main(String args []) {}";
        int count = 0;
        int index = -1;
        String findChar = "a";

        index = str.indexOf(findChar);
        while(index >= 0) {
            count ++;
            //str = str.substring(index + 1);
            //index = str.indexOf(findChar);

            index = str.indexOf(findChar,index + 1);
        }
        System.out.println(count);
    }

    private static void n37()  {
        int i = 234;
        int temp = i;
        int a = i % 10;
        int b = i / 10 % 10;
        int c = i / 100;
        boolean result = (temp == a* a + b * b + c * c);
    }

    private static void n38() throws IOException {
        File file = new File("C:\\1.data");
        System.out.println(file.getName());
        FileInputStream stream = new FileInputStream(file);
        long length = file.length();// 输出文件的长度
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String line = null;
        while((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

}
