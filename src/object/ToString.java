package object;

import java.util.Date;

/*
 * Object當中toString()的使用方式：
 * 
 * 1. 當我們輸出一個object reference的時候，實際上就是調用當前對象的toString()
 * 
 * 2. Object class當中的toString()定義：
 *  public String toString() {
 *      return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *   }
 * 
 * 3. String, Date, File, 包裝類都重寫了Object當中的toString(), 使得在調用對象的toString()時，會返回"實體內容"。
 * 
 * 4. 自定義類也可以重寫 toString()方法，當調用此方法的時候返回對象的”實體內容“
 * 
 */

public class ToString {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom", 21);
        System.out.println(cust1.toString()); // object.Customer@15db9742 --> Customer[name=Tom, age=21]
        System.out.println(cust1); // object.Customer@15db9742 --> Customer[name=Tom, age=21]

        String str1 = new String("MM");
        System.out.println(str1); // MM

        Date date = new Date(34232525L);
        System.out.println(date); // 時間
    }
}

class Customer {
    int age;
    String name;

    public Customer(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer[name=" + name + ", age= " + age + "]";
    }

}