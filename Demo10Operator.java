/*
一元運算符：只需要一個數據就可以進行操作，例如：取反!, 自增++, 自減--
二元運算符：需要兩個數據才可以進行操作，例如：加法+, 減法-
三元運算符：需要三個數據才可以進行操作

格式：
數據類型  變量名稱 = 判斷條件 ? expression A : expression B;

流程：
首先判斷條件是否成立：
  如果條件判斷為True --> 那麼expression A的值會賦予給變量;
  如果條件判斷為False --> expression B賦予值給變量;
二者選其一。

注意事項：
1. 必須同時保證expression A和expression B符合左側數據類型的要求。
2. 三元運算符的結果必須要被使用到。
*/

public class Demo10Operator {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    //數據類型 變量名稱 = 條件判斷 ? expression A : expression break;
    //判斷a > b是否成立，如果成立將a的值給max; 如果不成立就把b的值給max
    int max = a > b ? a : b;
    System.out.println("最大值：" + max); // 20

    //int result = 3 > 4 ? 2.5 : 10; -->錯誤寫法

    System.out.println(a > b ? a : b); //正確寫法

    //a > b ? a : b; -->錯誤寫法
  }
}
