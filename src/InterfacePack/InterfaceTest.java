package InterfacePack;

/**
 * 
 * 有時候從幾個class當中派生出一個subclass，繼承他們所有的屬性跟方法。可是Java並不支持多重繼承，有了interface，就可以達到multi-inheritance的效果
 * 繼承是一個“是不是”的關係
 * 接口是一個"能不能"的關係 -> 本質像契約、標準、規範，制定好後大家都需要遵守
 * 
 * 接口的使用：
 * 1. 接口使用interface來定義
 * 
 * 2. Java當中，interface和class是parallel的兩個結構
 * 
 * 3. 如何定義街口：定義接口中的成員
 * 3.1: JDK7以前：只能定義全局常量跟抽象方法
 * > 全局常量：public static final, 但是撰寫的時候可以省略
 * > 抽象方法：public asbtract
 * 3.2: JDK8：還可以定義靜態方法、默認方法
 * 
 * 4. interface不能定義constructor --> 意味著interface不可以被實例化！！
 * 
 * 5. Java開發中，interface通過讓class "implements"的方式來實現
 * > 如果實現類Override了interface當中的所有abstract method, 則此類就可以實例化
 * > 如果實現類沒有Override interface的所有方法的話，那麼此class仍舊是一個abstract class
 * 
 * 6. Java class可以實現多個interface --> 解決了Java single inheritance的限制
 * 格式： class AA extends BB implements CC, DD, EE {}
 * 
 * 7. interface之間是可以多繼承的
 * 
 * 8. interface會體現出“多態性”
 *
 * 面試題：抽象類和interface差異在哪？
 * 1. Abstract classes can have constants, members, method stubs (methods
 * without a
 * body) and defined methods, whereas interfaces can only have constants and
 * methods stubs.
 * 2.Methods and members of an abstract class can be defined with any
 * visibility, whereas all methods of an interface must be defined as public
 * (they are defined public by default).
 * 3.
 * 
 * 
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        // Flyable.MIN_SPEED = 2; // 會報錯，因為MIN_SPEED是一個public static final的constant
    }
}

interface Flyable {

    // 全局常量
    public static final int MAX_SPEED = 7900;
    int MIN_SPEED = 1; // 省略了public static final

    // 抽象方法
    public abstract void fly();

    // 省略了public abstract
    void stop();

}

class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Plane Fly");
    }

    @Override
    public void stop() {
        System.out.println("Plane stop");
    }
}

abstract class Kite implements Flyable {
    @Override
    public void fly() {

    }
    // 類沒有Override interface的所有方法的話，那麼此class仍舊是一個abstract class
}

interface Attackable {
    public abstract void attack();

}

class Bullet extends Object implements Flyable, Attackable {

    @Override
    public void attack() {
        // TODO Auto-generated method stub

    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub

    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub

    }

}

interface AA {

}

interface BB {
    void method2();
}

interface CC extends AA, BB {

}