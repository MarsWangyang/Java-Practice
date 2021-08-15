public class Demo02Variable {
  public static void main(String[] args) {
    //創建變量
    //格式：數據類型 變量名稱;
    int num1;
    // 向變量當中存入一個數據
    // 格式：變量名稱 = 數據值;
    num1 = 10;
    // 當輸出變量名稱的時候，顯示出來的是變量的內容。
    System.out.println(num1); // 10

    // 改變變量當中本來的數字，變成新的數字
    num1 = 20;
    System.out.println(num1); //20

    // 使用一步到位的格式定義變量
    // 格式：數據類型 變量名稱 = 數據值;
    int num2 = 2;
    System.out.println(num2);
    System.out.println("===================");

    byte num3 = 30; //**注意**：右側數值的範圍不能超過左側數據類型的取值範圍
    System.out.println(num3);

    //byte num4 = 400; //右側超出byte數據範圍(-128~128) --> Error
    //System.out.println(num4);

    short num5 = 50;
    System.out.println(num5);

    long num6 = 300000000L;
    System.out.println(num6);

    float num7 = 2.5F;
    System.out.println(num7);

    double num8 = 1.2;
    System.out.println(num8);

    char tw1 = 'A';
    System.out.println(tw1);

    tw1 = '台';
    System.out.print(tw1);

    char tw = '灣';
    System.out.println(tw);

    boolean var1 = true;
    System.out.println(var1);

    var1 = false;
    boolean var2 = var1;
    System.out.println(var2);


  }
}
