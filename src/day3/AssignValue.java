package day3;

public class AssignValue {
    public static void main(String[] args) {
        // continuous assignment
        int i1, j1;
        i1 = j1 = 10;
        int i2 =10, j2 = 20;


        // Notice!
        short s1 = 10;
        // s1 = s1 + 2; // Error --> cuz 2 is an int
        s1 += 2; // can do it. won't convert the type of data. --> Better one.

        // Exercise:
        int m=2;
        int n=3;
        n *= m++; // n = n * m++ --> n = 3 * 2;
        System.out.println(m++); // 3
        System.out.println(n); // 6


        int n1 = 10;
        n1 += (n1++) + (++n1); // n1 = n1 + n1++ + ++n1 --> n1 = 10 + 10 + 11
        System.out.println(n1); // 32


    }
}
