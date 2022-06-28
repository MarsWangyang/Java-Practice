package staticPack;

/*
 * 1. static: 靜態的
 * 
 * 2. static可以用來修飾：fields, methods, 程式碼, 內部類
 * 
 * 3. 使用static修飾Fields：靜態變量（或是類變量）
 * - 屬性：依照使用static修飾，又分為：靜態屬性（類變量）vs 非靜態屬性(實例變量)
 *      - 實例變量：創建類的多個對象，每個對象都獨立擁有一套類中的非靜態屬性。當修改其中一個對象中的非靜態屬性時，不會導致其他對象中同樣的屬性值被修改。
 *      - 靜態變量（類變量）：創建類的多個對象，多個對象會共享同一個靜態變量。當通過每一個對象修改靜態變量時，會導致其他對象調用此靜態變量是被修改過的（大家共用）。    
 * - 靜態變量是隨著class的生成而生成，會比對象的創建來的要更早創建（創建對象要呼叫new，在這之前就已經有static variable）
 * - 由於class只會加載一次（生成class的時候會把class丟入緩存），則靜態變量在memory中也只會存在一份，存在在方法區的靜態域中。
 * - 調用：         類變量      實例變量
 *      class       yes         no
 *      object      yes         yes
 * - e.g. Math.PI, System.out
 * 
 * 
 * 4. 使用static修飾方法：靜態方法
 * - 隨著class的生成而生成，可以通過class.method去調用，不用再通過object調用。
 * - 調用：         類方法      實例方法
 *      class       yes         no
 *      object      yes         yes
 * - 靜態方法中，只能調用靜態的方法或是屬性
 * - 非靜態方法中，都可以調用（非靜態的屬性方法or靜態的屬性方法）
 * 
 * 5. static 注意點：
 * - 在靜態的方法中，不能使用this, super 關鍵字
 * 
 * 6. 開發中，是否該聲明為static?
 * - 屬性：
 *      - 屬性是可以被多個對象所共享，並且不會因為對象不同而不同的。
 * - 方法：
 *      - 操作靜態屬性的方法，通常就設定為static
 *      - utils class當中的方法，習慣聲明為static，e.g. Math, Arrays, Collections
 * 
 * 
 * 
 */
public class staticTest {
    public static void main(String[] args) {
        System.out.println(Taiwanese.nation); // 隨著class的生成而生成，不需要等對象被創建

        Taiwanese t1 = new Taiwanese();
        Taiwanese t2 = new Taiwanese();

        t1.age = 10;
        t2.age = 20;
        t1.name = "Mars";
        t2.name = "Max";

        t1.nation = "TW";
        System.out.println(t2.nation); // TW
    }
}

class Taiwanese {
    // 非靜態屬性（實例變量）
    String name;
    int age;

    // 靜態屬性
    static String nation;

    public static void eat() {
        System.out.println("Taiwanese eat");
        // 不能調用非靜態結構
        // System.out.println(this.name);
    }

}
