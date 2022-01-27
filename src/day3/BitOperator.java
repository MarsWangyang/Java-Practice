package day3;
/*
Bit Operator can only be used on integer.
1. << n : move n bit to left and fill 0 at the right end. --> multiple 2^n
2. >> n : move n bit to right, at the leftmost should observe the leftmost number of original binary number. --> divide 2^n
3. >>> n (there is no <<<) : no matter 0 or 1 are at the leftmost of the original binary number, leftmost will fill 0 in it.


*/

public class BitOperator {
    public static void main(String[] args) {
        int i =21;
        System.out.println(i << 2); // 84 -> multiple 4
        System.out.println(i << 27); // -147639... -> multiple 27, but at the leftmost bit becomes a negative number.


    }
}
