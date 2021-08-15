/*
ASCII: American Standard Code for Information Interchange.
Unicode(萬國字): 萬國碼，也是數字和符號的對照關係，開頭0~1237部分和ASCII
完全一模一樣，但是從128開始包含有更多字符，包含Emoji.

48 - '0'
65 - 'A'
97 - 'a'
*/
public class Demo03DataType{
  public static void main(String[] args) {
    char zifu1 = '1';
    System.out.println(zifu1 + 0); //49 --> ASCII: '0' --> 48

    char zifu2 = 'A';
    System.out.println(zifu2 + 0); //其實底層保存的是65數字

    char zifu3 = 'c';
    // 左側是int類型，右邊是char類型
    // char --> int，確實是從小到大
    // 發生了自動類型轉換
    int num = zifu3;
    System.out.println(num); // 99

    char zifu4 = '中';
    System.out.println(zifu4 + 0);
  }
}
