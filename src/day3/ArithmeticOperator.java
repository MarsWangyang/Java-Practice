package day3;

/*
%: mod: negative numbers are available.
*/
public class ArithmeticOperator {

    public static void main(String[] args) {
        // division:
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2; // 2
        int result2 = num1 / num2 * num2; // 10
        double result3 = num1 / num2; // 2.0
        double result4 = num1 / num2 + 0.0; // 2.0
        double result5 = num1 / (num2 + 0.0); // 2.4
        double result6 = (double) (num1 / num2); // 2.0
        double result7 = (double) num1 / num2; // 2.4

        // a++: add one first then operate
        // ++a: operate first then add one
        int a1 = 10;
        int b1 = ++a1; // b1 = 11, a1 = 11
        int b2 = a1++; // b2 = 10, a1 = 11


        // a--, --a
        int a2 = 10;
        int b3 = --a2; // b3 = 9, a2 = 9
        int b4 = a2--; // b4 = 10, a2 = 9

    }
}
