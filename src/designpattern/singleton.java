package designpattern;

/*
 * 單例模式：採取一定的方法保證在整個software design當中，對某個class只能存在一個object（對象實例），並且該class只能提供一個取得期object的方法。
 * 作法：
 * 1. constructor的訪問權限設定為private 
 *      -> 這樣就不能用new operation在class的外部產生class object, 但在class內部仍然可以產生該class的對象。
 *      -> 因為在class外部開始還無法得到實例對象，只能調用該類的某個 static method以return class內部創建的對象，靜態方法也只能訪問class中的靜態variable
 * 2. 因此，類對象的變量也必須定義成static
 * 
 * 生成： 
 * - 餓漢式：對象加載時間過程。但thread是安全的
 * - 懶漢式：better，延遲創建對象。對於thread是不安全的
 * 
 * 優點：因為只生成一個instance，減少系統性能開銷。當個對象產生需要比較多的資源時e.g. IO, 產生其他依賴對象時，則可以通過在application啟動時，直接產生一個singleton object，然後永久貯留在memory當中的方式解決
 * 
 * 應用場景： 
 * 1. 網站的計數器
 * 2. 應用程式的log application: 一般因為共享的日誌文件一直處於打開狀態，因此只能有一個instance去操作，否則內容將會不好追加。
 * 3. 數據庫連接池：因為數據庫連接是一種數據庫資源，如果連線太多，會造成資源大損耗。
 * 4. 讀取配置文件的class，每有必要每次使用配置文件數據，都生成一個對象去讀取
 * 5. Application
 * 6. Windows當中的task Manager (任務管理器)
 * 7. Windows當中的Recyvle Bin (回收站)
 * 
 * 
 */

public class singleton {
    public static void main(String[] args) {
        // Bank b1 = new Bank();
        // Bank b2 = new Bank();

        Bank b1 = Bank.getInstance();
        Bank b2 = Bank.getInstance();

        System.out.println(b1 == b2); // true

        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();

        System.out.println(o1 == o2);
    }
}

// 餓漢式實踐
class Bank {
    // 1. 私有化constructor -> 避免從外部造對象
    private Bank() {

    }

    // 2. 內部創建類的對象
    // 4. 要求此對象必須聲明為static才可
    private static Bank instance = new Bank();

    // 3. 提供公共 and static 的方法，返回class的對象 (因為不能產生Bank object，因此一定得透過設定成static
    // method來調用)
    public static Bank getInstance() {
        return instance;
    }
}

// 懶漢式
class Order {
    // 1. 私有化class的constructor
    private Order() {

    }

    // 2. 聲明當前類對象，沒有初始化
    // 4. 此對象也必須聲明為static
    private static Order instance = null;

    // 3. 聲明public, static的返回當前類對象的方法
    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }
}