/*
Overloading 多個方法的名稱一樣，但是參數列表不一樣。
*/

public class Demo15Overload {
  public static void main(String[] args) {
    System.out.println(sum(1.7, 3));
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static int sum(int a, int b, int c, int d) {
    return a + b + c + d;
  }

  public static int sum(double a, double b) {
    return (int) (a + b);
  }

  public static int sum(int a, double b) {
    return (int) (a + b);
  }

  public static int sum(double a, int b) {
    return (int) (a + b);
  }


}
