package codeblock;

/*
 * 代碼塊aka初始化塊
 * 
 * 1. 代碼塊的作用: 用來初始化class or object
 * 2. 如果有修飾，只能使用static。
 * 3. 分類：
 * - 靜態(static)代碼塊：
 *      > 內部可以有輸出語句
 *      > 隨著class的加載而執行，而且只會執行一次
 *      > 作用：初始化類的屬性
 *      > 如果一個class中定義了多個static代碼塊，則按照declare的先後順序執行
 *      > 靜態代碼塊的執行需要比non-static代碼塊更優先執行
 *      > 靜態代碼塊內只能調用靜態的屬性、以及靜態的方法，不能調用非靜態的結構
 * 
 * - 非靜態代碼塊：
 *      > 內部可以有輸出語句
 *      > 隨著對象的創建而執行
 *      > 每創建一個對象，就執行一次非靜態代碼塊
 *      > 作用：可以在創建對象的時候，對object的屬性進行初始化
 *      > 如果一個class定義了多個non-static代碼塊，則按照的先後順序執行
 *      > 非靜態代碼塊內可以調用靜態的屬性、靜態的方法、或是非靜態的屬性或是方法
 * 
 * - 屬性賦值的順序：
 *  1. 默認初始化
 *  2. 顯式初始化 or 在代碼塊中賦值 (會依照兩個的先後順序而有差異)
 *  3. 構造器中初始化
 *  4. 有了對象以後，可以通過"對象.field" or "object.method"的方法，進行賦值
 */
public class CodeBlock {
    public static void main(String[] args) {
        String desc = Person.desc; // hello, static block
        System.out.println(desc); // I am a guy.

        Person p1 = new Person(); // hello, non static block
        Person p2 = new Person(); // hello, non static block
        System.out.println(p1.age); // 1

        String desc2 = Person.desc; // 沒東西
    }
}

class Person {
    // Fields
    String name;
    int age;
    static String desc = "我是一個人";

    // Constructor
    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // static代碼塊
    static {
        System.out.println("hello, static block - 1");
        desc = "I am a guy.";
    }
    static {
        System.out.println("hello, static block - 2");

    }

    // 非靜態代碼塊
    {
        System.out.println("hello, non static block");
        age = 1;
    }

    // 方法
    public void eat() {
        System.out.println("吃飯");
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}