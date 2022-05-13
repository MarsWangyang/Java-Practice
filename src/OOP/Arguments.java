package OOP;

/**
 * 形參 parameters: 方法聲明時的參數
 * 實參 arguments: 方法調用時候實際傳給parameters的values
 * 
 * How to pass the value of arguments into methods?
 * <Ans> JAVA裡面只有一種參數的傳遞方式：pass in value
 * 也就是說將arguments參數的copy傳入方法內，而原本的arguments本身不受影響
 * => parameters如果是primitive type: 將arguments的"value"傳遞給parameters
 * => parameters如果是reference type: 將arugments的"address"傳給parameters
 */

public class Arguments {
    public static void main(String[] args) {
        int m = 10;
        int n = m;

        System.out.println("m = " + m + ", n = " + n);

        n = 20;
        System.out.println("m = " + m + ", n = " + n);

        System.out.println("========Reference Type==========");

        Order o1 = new Order();
        o1.orderID = 12;

        Order o2 = o1;

        System.out.println("o1.orderID = " + o1.orderID + ", o2.orderID = " + o2.orderID);

        o2.orderID = 1002;

        System.out.println("o1.orderID = " + o1.orderID + ", o2.orderID = " + o2.orderID); // 1002, 1002
                                                                                           // 因為兩個stack當中的addresses,
                                                                                           // 都指向了heap當中同一個對象實體

    }

}

class Order {
    public int orderID;
}