package OOP;

/*
OOP學習三條主線：
1. Java 類別以及類的成員：屬性、方法、constructor; code, innerclass

2. 三大特性：封裝、繼承、多型

3. 其他關鍵字：this, super, static, final, abstract, interface, package, import
---------------------------------------------
面向過程(POP): 強調的是功能行為，以function為a unit，考慮怎麼做
物件導向(OOP)：強調具備了功能的對象，以 class/object為a unit，考慮誰來做
e.g. 人把大象裝進去冰箱當中
POP：把冰箱打開 -> 抬起大象，塞進冰箱 -> 把冰箱門關起來
OOP：
人 {
    打開(冰箱)
    {
        冰箱.open();
    }
    
    抬起(大象) {
        大象.enter(冰箱);
    }

    關閉(冰箱) {
        冰箱.close();
    }
}
冰箱 {
    Open(){};
    Close(){};
}
大象 {
    Enter(冰箱){}
}
----------------------------------------
OOP的兩個要素：
class: 對一類事物的描述，是抽象的，概念上的定義
object: 是實際存在的每個個體，也稱為instance
-> OOP的重點是設計class, 就是設計class的member
----------------------------------------
(Memory)
Stack: 儲存local variable
Heap: 儲存已經創建的instance
----------------------------------------


Field (成員變量) v.s. 局部變量
1. 相同點：
- 格式: DataType variableName = value
- 先宣告，後使用
- 變量都有其對應的作用域
 
2. 不同點：
- 在class當中聲明位置的不同而不一樣
    - Field: 直接定義在class {}當中
    - local variable: 宣告在Method, method 參數,  程式碼區塊內, constructor參數, contructor 內部的變量
- 權限修飾符號的不同：
    - Field: 可以指定access的權限為多少，使用keyword來限制。
             常用的有private, public, protected --> encapsulation
    - 局部變量：不可以使用權限keyword
- 默認初始化的情況：
    - Field:
        byte, short, int, long => 0
        float, double => 0.0
        char => 0 or u000
        boolean => false
        reference type => null
    - 局部變量：No default value => 表示在access局部變量的時候，一定要先被初始化，不然不同被使用！
              except for 形參
- 在記憶體當中加載的位置：
    - Field: Load into Heap (non-static)
    - Local variable: Load into Stack
    - instance (new出來的object): Load into Heap
        
*/

public class OOPConecpt {
    public static void main(String[] args) {
        // 創建Person class object
        Person p1 = new Person();

        // 調用field
        p1.name = "Mars";
        p1.isMale = true;
        System.out.println("Name: " + p1.name);

        // 調用method
        p1.talk("Taiwanese");
        p1.sleep();
        p1.eat();

        Person p2 = new Person();
        System.out.println(p2.name); // null
        System.out.println(p2.isMale); // false
    }
}

class Person {
    // Field 屬性（成員變量）
    String name;
    int age = 1;
    boolean isMale;

    // Method 方法（函數）
    public void eat() {
        System.out.println("human can eat");
    }

    public void sleep() {
        System.out.println("human can sleep");
    }

    public void talk(String language) {
        System.out.println("human can talk " + language);
    }
}

class User {
    // Field (成員變量)
    String name;
    int age;
    boolean isMale;

    public void talk(String language) { // language: 局部變量 local variable
        System.out.println("We use " + language + " to communicate with others");
    }

    public void eat() {
        String food = "bubble tea"; // local variable
        System.out.println("Taiwanese likes to drink " + food);

    }
}