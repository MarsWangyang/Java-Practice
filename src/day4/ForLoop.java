package day4;

public class ForLoop {
    public static void main(String[] args) {
        int cnt = 5;
        for (int i = 0; i < cnt; i++) {
            System.out.println("Hello World");
        }

        int num = 0;
        for (System.out.print("a"); num < cnt; System.out.print("c"), num++) {
            System.out.print("b");
        }
    }
}