package day3;

/*
Logic Operator:
1. a ^ b: Exclusive Or. (0,1), (1,0) --> true
2. a&b, a&&b

 */
public class LogicalOperator {
    public static void main(String[] args) {
        // Better: || and &&

        // Differentiate & and &&
        boolean b1 = true;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("This is & display11."); // Show Up!
        } else {
            System.out.println("This is & display12.");
        }
        // num1 = 11

        boolean b2 = true;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println("This is & display21.");
        } else {
            System.out.println("This is & display22.");
        }

        System.out.println(num2);
        // num2 = 11

        boolean b3 = false;
        int num3 = 10;
        if (b3 & (num3++ > 0)) {
            System.out.println("This is & display31.");
        } else {
            System.out.println("This is & display32.");
        }
        // num3 = 11

        boolean b4 = false;
        int num4 = 10;
        if (b4 && (num4++ > 0)) {
            System.out.println("This is & display41.");
        } else {
            System.out.println("This is & display42.");
        }
        // num4 = 10 --> Already know that b4 = false, so the statement (num4++ > 0)
        // will not compile

        // Difference between | and ||:
        // when the statement on the left hand is true, | will keep compiling till the
        // right hand side statement finish
        // but || will no longer run the code on the right hand side.
    }
}