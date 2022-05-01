package day4;
/*
根據switch statement中的vaule，依照case中的statement，如果與case statement match，則會進入該case的logic當中，execute it.
當執行完該case當中的logic過後，繼續向下執行其他case當中的logic，直到遇到break keyword或是到default當中才會結束１ㄥ

當邏輯只要到break，就會直接跳出switch-case語句

switch statement當中只可以是以下6種數據之一：byte, short, char, int, enum, String

*/

public class SwitchCase {
    public static void main(String[] args) {
        int number = 1;
        switch (number) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}