package day3;

public class AriExcercise {
    public static void main(String[] args) {
        int num = 187;
        int hun = num / 100;
        int ten = num % 100 / 10;
        int digit = num % 10;
        System.out.println("百位數：" + hun);
        System.out.println("十位數：" + ten);
        System.out.println("個位數：" + digit);

    }
}
