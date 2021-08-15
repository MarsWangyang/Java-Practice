/*
對於byte/short/char三種類型來說，如果右側賦值的數值沒有超過範圍
那麼javac編譯器將會自動隱含地為我們補上一個(byte)(char)(short)
1. 如果沒有超過左側的範圍，那麼編譯器補上強制類型轉換。
2. 如果右側超過了左側範圍，那麼直接編譯器報錯。
*/

public class Demo12Notice {
  public static void main(String[] args){
    //右側是一個int，但是沒有超過左側的範圍
    //int --> byte，不是自動類型轉換
    byte num1 = /*(byte)*/ 30;
    System.out.println(num1);

    char zifu = /*(char)*/ 65;
    System.out.println(zifu);
  }
}
