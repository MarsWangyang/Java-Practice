package InterfacePack;

public class InterfaceNewAttributeClass {
    public static void main(String[] args) {
        SubClass s = new SubClass();

        // s. method1(); -> 會出現Error
        // 知識點1: interface當中定義的static method，只能通過interface來調用
        InterfaceNewAttribute.method1();
        // 知識點2: 通過class的對象可以調用default method
        // 如果實現類重寫了接口中的default method，那麼調用的時候，仍然調用的會是Overrided method
        s.method2();
        // 知識點3: 如果子類or實現類繼承的parent class和實現的interface當中有著相同名稱以及參數的default方法，
        // 那麼subclass在沒有override此方法的情況下，default調用的是父類當中同名同參的default方法 --> 類優先原則
        // 知識點4: 如果實現類實現了多個interface，而這個多個interface當中定義了同名同參數的default method
        // 那麼在實現類沒有重寫此方法的情況下就會Error --> interface conflit
        // 這時候就需要在實現類當中Override此default method

        s.method3();

    }
}

class SubClass extends SuperClass implements InterfaceNewAttribute, InterfaceNewAttribute2 {
    @Override
    public void method2() {
        System.out.println("SubClass: New Taipei");
    }

    @Override
    public void method3() {
        System.out.println("Subclass: Keelung");
    }

    // 知識點5. 如何在子類或是實現類的方法中調用父類、接口中被重寫的方法
    public void myMethod() {
        method3(); // 調用自己定義的Overrided method
        super.method3(); // 調用parent class當中聲明的
        // 調用interface當中的default method
        InterfaceNewAttribute.super.method3();
        InterfaceNewAttribute2.super.method3();
    }

}

class SuperClass {
    // 定義和InterfaceNewAttribute接口當中一樣的method name
    public void method3() {
        System.out.println("SuperClass: Keelung");
    }
}

interface InterfaceNewAttribute2 {
    default void method3() {
        System.out.println("InterfaceNewAttribute2: New Taipei");
    }
}