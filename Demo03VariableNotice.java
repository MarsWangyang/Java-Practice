public class Demo03VariableNotice {
    public static void main(String[] args) {
      int num1 = 10; // 創建一個新的變量 名叫num1
      //int num2 = 10; 又創建另一個變量，名字也叫num1 --> Error

      int num2 = 20;
      int num3;
      num3 = 30;
      int num4; // 定義一個變量，但是沒有進行賦值
      //System.out.println(num4) 直接輸出會是Error

      //System.out.println(num5) --> 在創建Variable前，不能使用此變量
      int num5 = 500;
      System.out.println(num5); // 500

      {
        int num6 = 60;
        System.out.println(num6); //60
      }
      //System.out.println(num6) --> 已經超出了大括號的範圍，超出了作用域，變量不能再使用
      int num6 = 600;
      System.out.println(num6+"cool");

      //同時創建三個都是int類型的變量
      int a, b, c;
      //各自分別賦值
      a = 10;
      b = 20;
      c = 30;
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);

      //同時創建三個int變量，並且同時賦值
      int x = 100, y = 200, z = 300;
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);

    }
}
