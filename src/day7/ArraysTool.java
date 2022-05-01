package day7;

import java.util.Arrays;

/**
 * 操作array的基本工具，可以直接拿來操作array
 */

public class ArraysTool {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4 };
        int[] arr2 = new int[] { 1, 3, 4, 2 };

        // isEquals (boolean)
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println("isEquals: " + isEquals);

        // toString (String)
        System.out.println(Arrays.toString(arr1));

        // fill (void) -> 將指定的value fill into a array
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        // sort (void)
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        // binarySearch (int)
        int[] arr3 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = Arrays.binarySearch(arr3, 3);
        if (index < 0) {
            System.out.println("沒找到唷");
        } else {
            System.out.println("index: " + index);
        }
    }
}