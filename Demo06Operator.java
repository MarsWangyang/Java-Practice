/*
使用方式：
1. 單獨使用：不和其他操作混合，自己獨立一個步驟
2. 混合使用：和其他操作混合，例如：賦值、輸出...等
使用區別：
1. 單獨使用時，前++和後++沒有任何區別，++num = num++;
2. 混合使用時：
  A. 如果是前++ --> 變量會先+1，然後拿著結果進行使用      [先加後用]
  B. 如果是後++ --> 首先使用變量原本的數值，然後再讓變量+1 [先用後加]
*/

public class Demo06Operator{
  public static void main(String[] args){
    int num1 = 10;
    System.out.println(num1);
    ++num1;
    System.out.println(num1);
    num1++;
    System.out.println(num1);
    System.out.println("-----------------------");

    int num2 = 20;
    System.out.println(++num2);
    System.out.println(num2++);

  }
}
