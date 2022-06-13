package ploymorphism;

/**
 * 多態性
 * 
 * 1. 理解：一個事物的多種型態
 * 2. 何為多態性？
 * 對象的多態性，就是用parent class的引用指向subclass的對象
 * 
 * 3. 多態的使用：
 * 有了對象的多態性之後，在compile的時候，只能調用parent class當中已經聲明好的methods。
 * 但在runtime得時候，實際上執行subclass重寫parent class的methods
 * 
 * 總結：compile -> left side; runtime -> right side
 * 
 * 4. 多態性的使用前提：
 * 4.1 class要有繼承性
 * 4.2 要有method的override (重寫 -> 一般subclass都會有重寫)
 * 
 * 5. 為什麼要有多態性？ Animal Example
 * 
 * 6. 對象的多態性，只適用在Method, 不適用Fields
 * 
 * 7. 多態性的方法調用是在運行時才確定的，因此是一個運行時的行為！！！！ -> 動態綁定/晚綁定
 * 
 * 8. 有了對象的多態性之後，memory當中實際上是load 子類特有的field以及method，但是因為variable聲明的是parent
 * class
 * 因此在編譯的時候，只能用parent class當中聲明的fields以及methods，subclass特有的fields以及methods不能調用！！
 * 
 * 事實上當使用到polymorphism的時候，一樣在heap當中所建立的區塊仍舊有subclass的fields and
 * methods，不過因為我們的object所定義的為parent class，因此無法去調用subclass的這些內容，需要利用casting
 * down才可以。
 * 
 * 9. instanceof的使用
 * a instanceof A: 判斷object a是否為class A的instance。
 * if true and then return true, vice versa.
 * 使用情境：當需要做casting down的時候，會先利用instanceof查看是否轉類型有錯誤 ->
 * 但一般來說好的程式碼不會有instanceof的使用。
 * 
 * 如果 a instanceof A return true, and then a instanceof B return true also. => B
 * is the parent class of A class
 * 
 * 注意：
 * 1. 若subclass override parent class
 * method，那個代表subclass的method徹底地覆蓋了parent當中同名的方法，因此系統不可能把parent class
 * method轉移到subclass當中 --> 編譯看左邊，運行看右邊
 * => Base b = new Sub();
 * => b.display(); => 調用的是Sub().display()的方法
 * 
 * 2. 但對於instance fields不存在override的現象，因此就算subclass中定義了相同的instance
 * fields，這個fields依然不會override parent class fields --> 編譯運行都看左邊！！
 * => Base b = new Sub();
 * => b.fields; -> 仍舊是class Base當中的instance fields
 * 
 */
public class Poly {
    public static void main() {
        Person p1 = new Person();
        p1.eat();
        System.out.println("************************");

        Person p2 = new Man(); // 這個就是 對象多態性 -> 對象的多種型態，右邊是真實的對象型態，也就是說parent class的refernce，指向sub class的對象
        p2.eat(); // 當調用subclass以及parent class同參數的method時， 實際上調用的為subclass重寫parent class的methods
                  // => 虛擬方法調用
        p2.walk();
        // p2.earnMoney(); // Error -> 多態性只能調用重寫的方法 => 第八點

        // 要如何才能夠用subclass的fields and Methods?
        // Casting Down, 使用強制類型轉換(不過動作非常危險，不建議使用，因為可能導致誤認subclass，而methods無法調用)
        Man m1 = (Man) p2;
        m1.earnMoney();
        m1.isSmoking = true;

        // 出現Error -> ClassCastException:
        // Woman w1 = (Woman) p2;
        // w1.goShopping(); -> During runtime，會因為new Man()當中並沒有.goshopping這個method而出現錯誤

        // 常見問題 of casting down
        // Q1: 編譯通過，但runtime不通過 -> Error
        // Person p3 = new Woman();
        // Man m3 = (Man) p3;

        // Person p4 = new Person();
        // Man m4 = (Man) p4; -> 原先p4就根本沒有Man當中的methods，因此根本沒辦法casting down。

        // Q2: 編譯通過，runtime也通過
        // Woman casts up to Object，然後再將Object casts down to Person
        Object obj = new Woman();
        Person p = (Person) obj;

        // Q3: 編譯不通過（不相干的兩個classes不可以相互cast）
        // Man m5 = new Woman();
        // String str = new Date();

        // Object obj1 = new Date();
        // String str1 = (String) obj1; -> 騙過編譯器，但是仍舊會在runtime無法運行

        Poly test = new Poly();
        test.func(new Dog());

        test.func(new Cat());
    }

    public void func(Animal animal) {
        animal.eat();
        animal.shout();
    }
}

class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("person eat");
    }

    public void walk() {
        System.out.println("person walk");
    }
}

class Animal {

    public void eat() {
        System.out.println("Animal eat");
    }

    public void shout() {
        System.out.println("Animal shout");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Bark Bark Eat");
    }

    public void shout() {
        System.out.println("Bark Bark Shout");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Meow Meow Eat");
    }

    public void shout() {
        System.out.println("Meow Meow Shout");
    }
}