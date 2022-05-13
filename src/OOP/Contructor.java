package OOP;

/**
 * 作用：
 * 1. 創建對象object
 * 2. 可以初始化Object's Fields
 * 
 * 說明：
 * 1. 如果沒有定義class constructor的話，則default給一個no parameters的constructor
 * 2. 格式：modifierAccessor className(params) {}
 * 3. 一個class中定義多個constructors, 彼此之間變成overload
 * 4. 一旦定義了class constructors, system will not supply a default null params
 * constructors for the class
 * 5. 構造器default的modifier accessor權限是跟著class的modifier accessor。
 * 
 * Field的賦值的順序：1 -> 2 -> 3 -> 4
 * 1. 默認初始化值 int age;
 * 2. 顯示式初始化 int age = 1;
 * 3. Contstructor賦值
 * 4. 通過"object.method" or "object.field"方式給值
 * 
 */

public class Contructor {
    public static void main(String[] args) {
        // 創建object: new + contructor
        Person p = new Person();
        Person p1 = new Person("Mars");
        System.out.println(p1.name);

        p.eat();
    }
}

class Person {
    // Field
    String name;
    int age;

    // Constructor
    public Person() {
        System.out.println("Person() ....");
    }

    public Person(String n) {
        this.name = n;
    }

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void eat() {
        System.out.println("People eat");
    }

}