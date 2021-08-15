/*
1. 對數值來說，就是加法。
2. 對於字符char類型來說，在計算之前，char會被提升為int，然後做計算。
3. 對於字符串String(字母首為大寫，並不是關鍵字)，加號代表字符串連接操作。
***任何數據類型和字符串進行連接的時候，結果都會變成字符串***
*/
  public class Demo05Plus{
     public static void main(String[] args){
       //字符串類型的變量基本使用
       //數據類型 變量名稱 = 數據值;
       String str1 = "Hello";
       System.out.println(str1);

       System.out.println("Hello" + "World");

       String str2 = "Java";
       // String + int --> String
       System.out.println(str2 + 20); // Java20

       //優先級問題
       // String + int + int
       // (String)     + int
       // String
       System.out.println(str2 + 20 + 30); // Java2030
       System.out.println(str2 + (20 + 30)); // Java50
     }
  }
