package day7;

public class ArrayException {
    public static void main(String[] args) {

        // ArrayIndexOutOfBoundsException
        int[] arr = new int[] { 1, 2, 3, 4 };
        System.out.println(arr[10]); // Error

        // NullPointException
        // case1:
        int[] arr1 = new int[] { 1, 2, 3 };
        arr1 = null; // 表示原本pointer指向array記憶體的adddress被抹掉指向null去了
        System.out.println(arr1[0]); // Error

        // case2:
        int[][] arr2 = new int[4][];
        System.out.println(arr2[0]); // null
        System.out.println(arr2[0][0]); // Error

        // case3:
        String[] arr3 = new String[] { "a", "b", "c" };
        System.out.println(arr3[0].toString()); // Error
    }
}