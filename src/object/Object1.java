package object;

/**
 * java.lang.Object
 * 1. Object class是所有Java class的parent class
 * 2. 如果class的聲明當中沒有使用extends指明其parent class，那麼就default為java.lang.Object為parent
 * class
 * 3. Object的功能 (Fields, Methos)具有通用性：
 * - Fields: 沒有
 * - Method: equals() [common] / toString() [common] / getClass() / hashCode() /
 * clone() 少用 / finalize()幾乎不用, 是系統回收機制的調用 / wait(), notify(), notifyAll()
 * 
 * 4. Object只有聲明一個empty parameters的constructors
 * 
 * 面試題： == 和 equals() 區別
 * 一、==：運算符
 * 1. 可以使用在基本數據類型變量以及reference variable之間
 * 2. 如果比較的是基本數據類型，那麼比較的是兩個變量保存的數據使否相等 (不一定要type相等)
 * 如果比較的是引用數據類型，那麼比較的就是兩個變量所在的address是否相等，即兩個對象是否指向同一個address
 * 
 * 二、equals(): 方法
 * 1. 是一個方法，不是operator
 * 2. 只能適用於"引用數據類型"
 * 3. object類當中equals()的定義
 * public boolean equals(Object obj) {
 * return (this == obj);
 * }
 * 說明：Object類當中定義的equals()和 == 是相同作用，比較兩個對象的address是否相等，即兩個引用是否指向同一個address
 * 4. String, Date, File, 包裝類，都重寫了Object
 * class當中的equals()。重寫以後，比較的不是兩個reference是否相同，而是比較兩個instaces的實際內容是否相同。
 * 5. 通常情況下，自定義的class當中equals()，也通常是比較兩個“實體內容”是否相同。
 * 
 * 
 * 
 */
public class Object1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        double c = 10.0;
        boolean d = true;
        char e = 10;
        System.out.println(a == b); // true
        System.out.println(a == c); // true
        // System.out.println(a == d); // Error
        System.out.println(a == e); // true

        char a1 = 'A';
        char a2 = 65;
        System.out.println(a1 == a2); // true

        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2)); // true -> 這個equals是string當中已經override的method
    }

}

class Customer {
    int age;
    String name;

    // 比較兩個對象的實體內容是否相同
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Customer) {
            Customer cust = (Customer) obj;
            // 比較兩個對象的每個屬性是否相同
            // if (this.age == cust.age && this.name.equals(cust.name)) {
            // return true;
            // } else {
            // return false;
            // }
            return this.age == cust.age && this.name.equals(cust.name);
        }
        return false;
    }
}