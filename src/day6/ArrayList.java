package day6;

/**
 * 1. Array是說多個“相同”類型並且按照一定順序排列的集合，通過編號的方式做統一的管理
 * 2. 數組屬於reference type, elements in array 可以是 primitive/reference type
 * 3. 數組會在memory中直接開一塊連續的空間給我們使用
 * 4. 數組的長度一確定過後，就不能再修改。
 */
public class ArrayList {
    public static void main(String[] args) {
        // one-dimension array

        // 1.1靜態初始化:數組的初始化，和元素的操作同時進行
        int[] ids; // declaration
        ids = new int[] { 1001, 1002, 1003, 1004 };
        // 1.2動態初始化：先給一個空間，在後續才去set value
        String[] names = new String[5];
        // False declaration
        // int[] arr1 = new int[];
        // int[5] arr2 = new int[5];
        // int[] arr3 = new int[3]{1,2,3};

        // 2.調用指定位置的elements: 透過index
        names[0] = "wang";
        names[1] = "Mars";
        names[2] = "steve";
        names[3] = "curry";
        names[4] = "Mac";

        // 3. 獲取array的長度：length
        System.out.println(names.length); // 5
        System.out.println(ids.length);

        // 4.如何traverse array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // 5.默認初始化值
        // > int, short, long: 0
        // > float, double: 0.0
        // > char: 0, '\u0000', 而不是'0'
        // > boolean: false
        // > 引用數據類型(e.g. String)：null, 不是"null"
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // 0
        }

        // two-dimension array
        int[][] arrTwo = new int[][] { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
        String[][] arrTwo2 = new String[3][2]; // row, column
        String[][] arrTwo3 = new String[3][]; // 只是還沒定義column數量，因此也是可以
        int[] arrTwo4[] = new int[3][];
        int[] arrTwo5[] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };

        System.out.println(arrTwo[0][0]);
        System.out.println(arrTwo2[0][0]);
        // System.out.println(arrTwo3[0][0]); // Null Error

        System.out.println(arrTwo.length); // 3
        System.out.println(arrTwo2.length); // 3
        System.out.println(arrTwo3.length); // 3

        for (int i = 0; i < arrTwo.length; i++) {
            for (int j = 0; j < arrTwo[i].length; j++) {
                System.out.print(arrTwo[i][j] + "  ");
            }
        }

        int[][] arrAddress = new int[4][3];
        System.out.println(arrAddress); // return的會是memory當中的address: [[I@36aa7bc2 ([[表示二維數組)
        System.out.println(arrAddress[0]); // [I@76ccd017 ([表示一維數組)
        System.out.println(arrAddress[0][0]);
    }
}