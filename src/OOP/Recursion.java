package OOP;

public class Recursion {
    public static void main(String[] args) {
        // Example
        Recursion r = new Recursion();
        System.out.println(r.getSum(3));
    }

    public int getSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getSum(n - 1);
        }
    }
}
