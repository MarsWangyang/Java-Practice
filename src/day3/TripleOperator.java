package day3;

/*
Structure: (Conditional expression)? statement1 : statement2
1. 所得出的result = boolean
2. 如果conditional expression = true -> execute statement1
else -> execute statement2 
3. 任何使用三元運算的statement，都可以改變成為if else
*/
public class TripleOperator {
    public static void main(String[] args) {
        int m = 12;
        int n = 5;

        int max = (m > n) ? m : n;
        System.out.println(max);

        double num = (m > n) ? 2 : 1.0;

        // (m > n)? 2 : "n大" --> Error
        String maxStr = (m > n) ? "M大" : ((m == n) ? "M和N相等" : "n大");
        System.out.println(maxStr);

        // 獲取三個數的最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;

        int max1 = (n1 > n2) ? n1 : n2;
        int max2 = (max1 > n3) ? max1 : n3;
        System.out.println("Max num in three number: " + max2);

        int max3 = (((n1 > n2) ? n1 : n2) > n3) ? ((n1 > n2) ? n1 : n2) : n3;
        System.out.println("Max num in three number2: " + max3); // not a good way

    }
}