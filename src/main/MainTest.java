package main;

/*
 * main()方法的使用說明：
 * 1. main()方法作為程序的入口
 * 2. main()方法也是一個普通的靜態方法
 * 3. main()方法可以做為我們與控制台交互的方式（之前用Scanner) 
 *  -> 透過add configuration去當作input args 或是 terminal當中：$ java <class name> <your args >
 */

public class MainTest {
    public static void main(String[] args) {
        Main.main(new String[100]);

        // show(); -> 靜態調用非靜態方法，因此會報錯

        for (int i = 0; i < args.length; i++) {
            System.out.println("*******" + args[i]);
        }
    }

    public void show() {

    }
}

class Main {
    public static void main(String[] args) {
        args = new String[100];
        for (int i = 0; i < args.length; i++) {
            args[i] = "args_" + i;
            System.out.println(args[i]);
        }
    }
}