package InterfacePack;

/**
 * 
 * Java 8當中除了定義global variable以及抽象方法之外，還可以定義static method and default method
 * 
 * 
 */

public interface InterfaceNewAttribute {
    // 靜態方法
    public static void method1() {
        System.out.println("InterfaceNewAttribute: Taipei");
    }

    // 默認方法
    public default void method2() {
        System.out.println("InterfaceNewAttribute: New Taipei");
    }

    default void method3() {
        System.out.println("InterfaceNewAttribute: Keelung");
    }
}
