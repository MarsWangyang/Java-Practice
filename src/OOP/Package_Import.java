package OOP;

/**
 * Package的使用：
 * 1. 在src下會有很多Java class，為了更好地實現project當中的管理，提供package的概念
 * 2. 使用package聲明class, interface所屬的package, 並declare在第一行
 * 3. package的名稱會是全小寫
 * 4. 每"."一次，代表一層文件的directory
 * 
 * 補充：同一個package, 不能有相同的interface, class名稱。
 * 不同的package, 可以有相同的interface, class名稱。
 * 
 * import的使用：
 * 1. 在source code當中使用import結構，用來導入指定package下的class, interface
 * 2. 需要導入多個結構，則並列寫出即可
 * 3. 如果要導入同個package下的多個class, interface： "XXX.*", 可以導入XXX下的所有內容 example: import java.utils.*;
 * 4. 如果想要用com.example1以及com.example2下面的兩個 Account.java => 使用時：com.example1.Account acc1 = new...., 以及com.example2.Account acc2 = new ...這樣才可以用
 * 
 * 
 */
import java.util.Arrays;

public class Package_Import {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[] { 1, 2, 3 });
    }
}