package day3;

public class ProcessFlow {
    public static void main(String[] args) {
        int heartBeats = 79;
        if (heartBeats < 60 || heartBeats > 100) {
            System.out.println("需要更一步的檢查");
        }
        System.out.println("檢查結束");

        // Example2:
        int age = 23;
        if (age < 18) {
            System.out.println("No Adult movie");
        } else {
            System.out.println("You may should watch adult movie");
        }

        // Exmaple3:
        if (age < 0) {
            System.out.println("The age you enter is unavailable");

        } else if (age < 18) {
            System.out.println("Teenageer");
        } else if (age < 35) {
            System.out.println("青壯年時期");
        } else if (age < 60) {
            System.out.println("中壯年時期");
        } else {
            System.out.println("老年時期");
        }

    }
}