/*
在給變量進行賦值時，如果右側的表達是當中全部都是常量，沒有任何變量，
那麼編譯器javac將會直接將若干個常量表達是計算得到結果，
short result = 5 + 8; //等好右邊全部都是常量
此稱為“編譯器的常量優化”

但是一旦expression終有變量參與，那麼就不能進行此種優化。
*/

public class Demo13Notice{
  public static void main(String[] args){
    short num1 = 10; //寫法正確，右側沒有超過左側範圍

    short a = 5;
    short b = 10;
    // short + short --> int + int --> println
    //short result = a + b; //錯誤寫法！左側需要是int類型

    //右側不用變量，而是採用常量-->不會報錯
    short result = 5 + 8;
    System.out.println(result);
  }
}
