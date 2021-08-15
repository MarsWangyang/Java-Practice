/*
switch注意事項：
1. 多個case後面數值不可以重複。
2. Switch後面小括號中只能是以下數據類型：
基本數據類型: byte/short/char/int
引用數據類型: String字符串、enum枚舉

3. Switch可以很靈活：前後順序可以顛倒，並且break語句是可以省略的。
*/
public class Demo14Switch {
  public static void main(String[] args) {
    int num = 3;

    switch (num) {
      case 1:
        System.out.println("這是禮拜一");
        break;
      case 2:
        System.out.println("禮拜二的");
        break;
      default:
        System.out.println("not impossible");
        break;

    }
  }
}
