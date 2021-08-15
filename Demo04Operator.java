/*
mode: 取餘數, %

Notice:
1. 一旦operation中有不同類型的數據，結果則會是數據範圍較大的那個。
*/
public class Demo04Operator{
  public static void main(String[] args){
    System.out.println(20 + 30);

    int a = 20;
    int b = 30;

    System.out.println(a + b);

    System.out.println(a * 10);

    int x = 10;
    int y = 3;

    int result = x / y ; //因為我們除法最後輸出要整數，所以只會剩整數
    System.out.println(result);

    int result2 = x % y;
    System.out.println(result2);

    // int + double --> double + double --> double
    double result3 = x + 2.5;
    System.out.println(result3);
    
  }
}
