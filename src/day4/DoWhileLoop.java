package day4;

/*
Do while loop至少會execute一次Loop，也就是說一定會跑一次loop才去檢查while裡面的statement>

*/
public class DoWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;
        int count = 0;
        do {
            if (num % 2 == 0) {
                System.out.println(num);
                sum += num;
                count++;
            }
            num++;
        } while (num <= 100);

        System.out.println("SUM: " + sum);

    }
}