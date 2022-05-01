package day7;

/*
Math.random(): [0.0, 1)
Math.random() * 90: [0.0, 90.0)
(int) Math.random() * 90: [0, 89] 
(int) (Math.random() * 90 + 10 ): [10, 99]
隨機數產生formula [a,b]： (int) (Math.random() * (b-a+1)) + a 

*/
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1)) + 10;
        }

        // Traversal:

        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Max:
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println("Max Value: " + maxValue);

        int minValue = 100;
        for (int item : arr) {
            if (minValue > item) {
                minValue = item;
            }
        }
        System.out.println("Min Value: " + minValue);

    }
}