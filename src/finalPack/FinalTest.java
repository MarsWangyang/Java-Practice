package finalPack;

/**
 * 1. final可以用來修飾的結構：class, method, variables
 * 
 * 2. final用來修飾一個class，代表就是最終一個，不能再被其他class所繼承
 * e.g. String, System, StringBuffer都是final class
 * -> 因為已經該有的方法都做完了，所以沒必要再擴充，因此變成final，不讓我們再去繼承。
 * 
 * 3. final用來修飾方法：表示這個method不能再被override
 * e.g. Object當中的getClass(): 獲取當前對象所屬的class
 * 
 * 4. final用來修飾variables: 此時的變量，就稱為是一個constant(常量)
 * - final修飾屬性，可以考慮的位置：顯式初始化(final int width = 10;)、代碼塊中初始化、構造器中初始化
 * -
 * final修飾局部變量：尤其是使用final修飾parameters，表明此param是一個constant。當我們調用此方法的時候，給params賦值一個arguments。
 * 一旦賦值之後，就只能在method內使用此參數，但不能進行重新賦值（修改）
 * 
 * 
 * static final: 用來修飾一個屬性, 代表全局常量(global variable)
 * 
 */

public class FinalTest {
    final int WIDTH = 10;
    final int LEFT;
    {
        LEFT = 1;
    }
    final int RIGHT;

    public FinalTest() {
        RIGHT = 2;
    }

    public void doWidth() {
        // Error: width現在因為final修飾，所以變成constant，無法再次改變。
        // width = 20;
    }

    public void show() {
        final int NUM = 10; // 常量 （局部變量成final）
        // NUM += 20; -> 因為已經是常量，不可以再被修改
    }

    public void show(final int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

    }
}

final class FinalA {

}

// Error: final class can't be inherited
// class B extends FinalA {
// }

class AA {
    public final void show() {

    }
}

class BB extends AA {
    // Error: final method can't be override
    // public void show() {
    // }
}