package day2;

/*
Type Conversion/Cast:
1. Automatic type casting up:
    byte, short, char --> int --> long --> float --> double
    * when byte, short, char are doing operation, the type of the result will be int.

2. Compelling type conversion:
    * might loss the accuracy
    Integer Type: Default int
    Decimal Type: Default double
*/
public class TypeCasting {
    public static void main(String[] args) {
        // Example of Automatic type casting up:
        byte b1 = 2;
        int i1 = 129;
        // byte b2 = b1 + i1; value is out of range

        int i2 = b1 + i1;
        long l1 = b1 + i1;
        float f = b1 + i1;
        short s1 = 123;
        double d1 = s1;


        // Operation of char
        char c1 = 'a';
        int i3 = 10;
        int i4 = c1 + i3; // 107 = 97(ASCII code) + 10

        short s2 = 10;
        // char c2 = c1 + s2; // Error --> can only declare the variable as int.

        // Example of Compelling type conversion:
        double d11 = 12.3;
        //int i1 = d11; // Error --> need to use strong conversion
        int i11 = (int) d11; // 12 (round down無條件捨去 )

        int i22 = 128;
        byte b22 = (byte) i22; // -128

        // Other cases:
        long l11 = 123321; // 123321 is regarded as int
        // float f1 = 12.3; // Error --> cuz 12.3 is regarded as double which range is larger than float, so Error pop out.

        // Notice!
        String str1 = "str1";
        // int num1 = /*(int)*/ str1; // Error --> you can't cast down from String to int
        int num1 = Integer.parseInt(str1); // you can do it for conversion from String to Integer.
    }
}
