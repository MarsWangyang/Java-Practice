public class Demo01DataType {
    public static void main(String[] args) {
      System.out.println(1024); //int
      System.out.println(3.14); //double

      //左邊是long, 右邊是int類型，左右不一樣
      //等號代表賦值，將右側的int常量，交給左側的long變量進行儲存
      //int --> long，符合了數據範圍"從小到大"的要求
      //發生自動類型轉換
      long num1 = 100; //沒有L也是可以的
      System.out.println(num1); //100

      //左邊是double, 右邊是long
      //float --> double，符合從小到大
      //自動類型轉換
      double num2 = 2.5F;
      System.out.println(num2);

      //左邊float, 右邊long
      //long --> float，float數據範圍比long來得更大
      //自動類型轉換
      float num3 = 30L;
      System.out.println(num3);

    }
}
