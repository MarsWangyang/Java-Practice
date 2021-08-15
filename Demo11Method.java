/*
定義一個方法的格式：
public static void 方法名稱() {
  方法體
}

方法體：大括號當中可以包含任意語句

注意事項:
1. 方法定義的先後順序無所謂
2. 方法的定義不能產生內鉗包含關係。
3. 方法定義好了後，需要進行調用才能夠執行。

如何調用方法：
方法名稱();
*/


public class Demo11Method {
  //Method的起點
  public static void main(String[] args) {
      //調用Method
      farmer();
      me();
      cook();

  }

  public static void cook() {
    System.out.println("洗菜");
    System.out.println("裝盤");
  }

  public static void me() {
    System.out.println("吃");
  }

  public static void seller() {
    System.out.println("抬高價格");
    System.out.println("賣東西");
  }

  public static void farmer() {
    System.out.println("種菜");
    System.out.println("收割");
  }

}
