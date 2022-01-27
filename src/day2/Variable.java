package day2;
/*
dataType variableName = value;
dataType:
1. primitive type: byte, short, long, int, float, double, char, boolean
2. reference type: class(string is a class, not a primitive type), interface, Arraylist[]

integer type:
    byte (1 byte),
    short (2 bytes)
    int (4 bytes)
    long (8 bytes)

decimal type:
    float (4 bytes): the range of valid value is larger than long type
    double (8 bytes)

char type:
    1 char (2 bytes)

*/

public class Variable {
    public static void main(String[] args) {
        // definition
        int myAge = 12;
        // usage
        System.out.println(myAge);

        // declaration
        int myNum;
        // assign/initiate a value
        myNum = 1001;

        // Integer Type
        byte b1 = 12;
        byte b2 = -128;
        // byte b3Error = -129;
        System.out.println(b1);
        System.out.println(b2);

        short s1 = 128;
        int i1 = 1234;
        long l1 = 123456L; // if you want to use long type, you need to add "l" or "L" at the end.

        // Decimal Type
        float f1 = 12.3f; // if you want to user float type, you need to add "f" or "F" at the end.
        double d1 = 123.3; // we usually use double type for declaration due to the better accuracy and larger range than float type.

        // Char Type
        char c1 = 'a';
        char c2 = '台';
        char c3 = '+';
        char c4 = '\n'; // aka Enter
        char c5 = '\t'; // aka Tab
        char c6 = '\u0043'; // using Unicode to assign the variable.
        //char c1 = 'AB'; // you can only assign a character

    }

    public void method() {
        int myClass = 1; // can't be used in main function, like System.out.println(myClass) in main(), which will jump out Error

    }
}
