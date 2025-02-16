package object;

/* 
 * 包裝類的使用：
 * 1. java提供8種基本數據類型對應的包裝類
 * 
*/

public class Wrapper {

    // String類型 --> 基本數據類型、包裝類：調用包裝類的parseXxx()
    public void test5() {
        String str1 = "123";
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        String str2 = "true1";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1); // false

    }

    // 基本數據類型、包裝類 --> String 類型
    public void test4() {
        int num1 = 10;
        // Method1: 連接運算變成String
        String str1 = num1 + "";

        // Method2: 調用String的valueOf(Xxx xxx)
        float f1 = 12.3f;
        String str2 = String.valueOf(f1); // "12.3"

        Double d1 = 12.4;
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3); // "12.4"
    }

    public void test3() {
        int num1 = 10;
        // 基本數據類型 --> 包裝類對象
        methodForTest3(num1); // 原先是不行的傳入的，因為int是基本數據類型. But since jdk 5.0, 有了自動裝箱以及自動拆箱。

        // 自動裝箱：基本數據類型 --> 包裝類
        int num2 = 10;
        Integer in1 = num2; // 自動裝箱

        boolean b1 = true;
        Boolean b2 = b1; // 自動裝箱

        // 自動拆箱：包裝類 --> 基本數據類型
        System.out.println(in1.toString());

        int num3 = in1;

    }

    public void methodForTest3(Object obj) {
        System.out.println(obj);
    }

    // 包裝類 --> 基本數據類型: 調用xxxValue()
    public void test2() {
        Integer in1 = Integer.valueOf(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1); // 13

        Float f1 = Float.valueOf(12.2f);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

    // 基本數據類型 --> 包裝類
    public void test1() {
        int num1 = 10;
        Integer in1 = Integer.valueOf(num1);
        System.out.println(in1.toString());

        Integer in2 = Integer.valueOf("123");
        System.out.println(in2.toString());

        // Error case - will throw NumberFormatException
        Integer in3 = Integer.valueOf("123abc");
        System.out.println(in3.toString());

        Float f1 = Float.valueOf(12.3f);
        Float f2 = Float.valueOf("12.4");
        System.out.println(f1);
        System.out.println(f2);

        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("TruE");
        System.out.println(b2); // true

        Boolean b3 = Boolean.valueOf("true123");
        System.out.println(b3); // false

    }

    public void interviewQ() {

        Object o1 = true ? Integer.valueOf(1) : Double.valueOf(2.0);
        System.out.println(o1); // 1.0 --> 這樣的statement後面兩個判斷式需要相同類型，因此拿了range較大的Double

        Object o2;
        if (true) {
            o2 = Integer.valueOf(1);
        } else {
            o2 = Double.valueOf(2.0);
        }
        System.out.println(o2); // 1

        Integer i = Integer.valueOf(1);
        Integer j = Integer.valueOf(1);
        System.out.println(i == j);// false --> address

        // Integer 內部定義了IntegerCache結構。IntegerCache中定義了Integer[],
        // 保存了-128~127範圍的整數。如果我們使用自動裝箱的方式，給Integer賦值的範圍在-128~127之間，可以直接使用數組當中的元素，就不用再去new。
        // 這樣的方式可以：提高效率
        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n); // true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y); // false

    }

}
