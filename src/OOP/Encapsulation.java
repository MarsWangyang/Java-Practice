package OOP;

/**
 * 為什麼需要封裝，以及作用和涵義為何？
 * <Ans> 使用洗衣機不用知道裡面的內部結構，我們只需要按開關以及選擇使用模式就好
 * 
 * Programming追求"高內聚、低耦合"
 * 高內聚：class內部數據操作自己完成，不允許外部干涉
 * 低耦合：僅對外部舖少量的methods做使用
 * 
 * 
 * 封裝性的體現：
 * 1. 將class的field private, 同時，提供public方法來獲取(getXXX)以及設置(setXXX)
 * 2. 不對外暴露私有的方法
 * 3. Singlton Pattern
 * 
 * Modifier accessor:
 * 1. public: in class, same package, 不同package的subclass, 同一個project當中
 * 2. protected: in class, same package, 不同package的subclass
 * 3. default(缺)： in class, same package
 * 4. private: in class
 * => 以上四種權限可以修飾class, 以及class的內部結構：Field, Methods, contructor, inner class
 * => 要修飾class的話：只能使用default, public
 * 
 */

public class Encapsulation {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "dog";
        a.age = 1;
        // a.legs = 4; => 因為legs是private所以沒辦法調用，是Animals class裡面私有的field
        a.setLegs(6);
        a.show();

        System.out.println("===================");
        Order od = new Order();

        // od.orderPrivate = 3; // 不可使用，因為private只能在自己的class當中被調用
        od.orderDefault = 4;
        od.orderPublic = 5;
    }
}

class Animal {
    String name;
    int age;
    private int legs; // 腿的個數

    // 對屬性的獲取
    public int getLegs() {
        return legs;
    }

    // 對屬性的設定
    public void setLegs(int l) {
        if (l >= 0 && l % 2 == 0) {
            legs = l;
        } else {
            legs = 0;
            // throws Exception
        }
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void show() {
        System.out.println("name = " + name + ", age = " + age + ", legs = " + legs);
    }
}

class Order {
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    void methodDefault() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }

    public void methodPublic() {
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
    }
}