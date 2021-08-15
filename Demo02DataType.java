public class Demo02DataType {
  public static void main(String[] arg){
      // 左邊是int類型，右邊是long類型，不一樣
      // long --> int，不是從小到大
      // 不能發生自動類型轉換!
      int num = (int) 100L; //強制類型轉換 並且這裡因為100數字很小，不會有溢出問題
      System.out.println(num);

      //long 強制轉換成為 int
      int num2 = (int) 6000000000L;
      System.out.println(num2); //1705032704 溢位

      //double --> int, 強制類型轉換
      int num3 = (int) 3.99;
      System.out.println(num3); // 3.x 這不是四捨五入，所有的小數位會被捨棄掉

      char zifu = 'A'; // 一個字符型變量，裡面是大寫字母 A
      System.out.println(zifu + 1); //66，也就是說大寫字母A被當成65進行處理
      // computer's structure的會用一個數字(二進制)來代表字符A，就是65。
      // 一旦char類型進行了數學運算，那麼字符就會按照一定的規則翻譯成為一個數字。

      byte num4 = 40; // 注意！右側的數值大小不能超過左側的數據類型範圍
      byte num5 = 50;

      // byte + byte --先提升轉換成為int--> int + int --> int
      int result1 = num4 + num5;
      System.out.println(result1); //90

      short num6 = 60;
      // byte + short --> int + int --> int
      // int強制轉換成為short: 注意必須保證邏輯上真實大小本來就沒有超過short範圍，
      // 否則會發生數據溢出。
      int result2 = (short) (num4 + num6);
      System.out.println(result2);
  }
}
