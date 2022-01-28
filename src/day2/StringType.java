package day2;
/*
1. String belongs to Reference data type (Class), not primitive data type
2. Sting can operate with primitive data type
*/

public class StringType {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "a";
        String s3 = "";
        // char c1 = ''; // Error, need to be assigned a character

        // Operation with primitive data type
        int num = 1001;
        String numStr = "ID";
        String info1 = numStr + num; // +: connection

        boolean b1 = true;
        String info2 = numStr + b1;
        System.out.println(info2); // IDtrue

        // Practice
        char c = 'a'; // 97
        int num1 = 10;
        String str = "hello";
        System.out.println(c + num1 + str); // 107hello
        System.out.println(c + str + num); // ahello10
        System.out.println(c + (num + str)); // a10hello
        System.out.println((c + num) + str); // 107hello
        System.out.println(str + num + c); // hello10a
    }
}
