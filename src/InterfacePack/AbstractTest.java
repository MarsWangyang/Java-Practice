package InterfacePack;

/**
 * 隨著繼承的層次會一個個的有子類被定義，class會開始變得越來越具體，這時候parent
 * class反而會看起來更general。但是類的設計原則就是要保證parent and sub是能夠共享特徵，因此會將parent
 * class變成抽象，以至於沒有具體的instance，這樣的class成為interface class
 * 
 * 1. abstract：抽象的
 * 2. abstract可以用來修飾的結構：class, method
 * 3. abstract修飾class: 抽象類
 * * > 此class不能被實例化
 * * >
 * 抽象類中一定有constructor，這樣可以讓subclass在實例化的時候使用(涉及到subclass實例化的過程，子類的constructor會call
 * * super()來去找父類的constructor)
 * * > 開發時候，一般來說都會提供抽象類的子類，讓子類對象實例化。
 * 4. abstract修飾method：抽象方法
 * > 抽象方法只有方法的聲明，沒有方法體(沒有{})
 * >
 * 包含抽象方法的class，一定是一個抽象class，反之，抽象類中可以沒有抽象方法（如果是一個正常的類但有抽象方法，有可能此類被實例化後，調用到這個抽象方法，就會報錯）
 * > 若子類重寫了父類中的所有抽象方法後，此子類才可以被實例化。
 * > 若子類沒有重寫父類中所有的抽象方法，那麼這個子類也就還是一個abstract class。
 * 
 * 
 * abstract 使用上的注意點：
 * 1. abstract不能用來修飾：屬性、constructor
 * 2. abstract不能修飾private, static method, final method, final class
 * 因為這樣就無法被Override那麼就沒辦法讓子類被實例化(final無法被子類繼承)
 */

public class AbstractTest {
    public static void main(String[] args) {

        // 一旦Person抽象畫，就不可實例化
        // Person p1 = new Person()
        // p1.eat()

        // 匿名對象。匿名：只用一次
        method1(new Student());

        Worker worker = new Worker();
        method1(worker); // 非匿名的類，非匿名的對象

        method1(new Worker()); // 非匿名的類，匿名的對象

        // 創建一個匿名的子類對象：s -> 這個不是Person object，而是在這邊當下創立的一個subclass
        Person p = new Person() {
            @Override
            public void eat2() {
                System.out.println("sub eat2");
            }

            @Override
            public void breath() {
                System.out.println("sub breath");
            }
        };

        method1(p);

        // 匿名子類的匿名對象
        method1(new Person() {
            @Override
            public void eat2() {
                System.out.println("sub2 eat2");
            }

            @Override
            public void breath() {
                System.out.println("sub2 breath");
            }
        });
    }

    public static void method1(Person p) {
        p.eat();
        p.breath();
    }

}

abstract class Creature {
    public abstract void breath();
}

abstract class Person extends Creature {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("people eats");
    }

    // 抽象方法
    public abstract void eat2();

    public void walk() {
        System.out.println("People walk");
    }

}

class Student extends Person {

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat2() {
        System.out.println("Student eats");
    }

    @Override
    public void breath() {
        System.out.println("student breath");
    }
}

class Worker extends Person {

    @Override
    public void eat2() {
        System.err.println("worker eat");
    }

    @Override
    public void breath() {
        System.out.println("worker breath");

    }

}