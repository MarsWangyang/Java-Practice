package OOP;

/**
 * 匿名對象的使用：
 * 1. 創建的對象，沒有obvious的set value to a variable, 就稱為匿名對象
 * 2. 匿名對象只能調用一次
 *
 */

public class Anonymous {
    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p);

        p.sendEmail();
        p.playGame();

        // Anonymous Objects, not the same object
        new Phone().sendEmail();
        new Phone().playGame();

        // common
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone()); // Phone()是stored in Stack, but still reference to Heap
    }
}

class PhoneMall {
    public void show(Phone phone) {
        phone.sendEmail();
        phone.playGame();
    }
}

class Phone {
    double price;

    public void sendEmail() {
        System.out.println("Send Email...");
    }

    public void playGame() {
        System.out.println("Play Game...");
    }
}