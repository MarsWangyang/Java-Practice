/*
 * 從keyboard當中獲取不同類型的變量 --> 利用Scanner class
 * 
 * 1. import java.util.Scanner;
 * 2. Scanner Instacne
 * 3. 調用Scanner相關的Methods (next() / nextXXX()), 來獲取指定類型相關的變量
 */
package day4;

import java.util.Scanner;

public class ScannerTutorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scan.next();
        System.out.println(name);

        System.out.println("Enter Your Age: ");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("Enter Your Weight: ");
        double weight = scan.nextDouble();
        System.out.println(weight);

        System.out.println("Are we mathced? (true/false)");
        boolean isMatched = scan.nextBoolean();
        System.out.println(isMatched);

        // For char type, Scanner目前沒有提供相關的method, 只能獲取一個String
        System.out.println("Enter your Gender: (M/F)");
        String gender = scan.next(); // "M"
        char genderChar = gender.charAt(0);
        System.out.println(genderChar);
    }
}