package superPack;

/*
 * How to use super keyword:
 * 1. super的理解：parent的
 * 2. super可以用來調用：Field, Method, Constructor
 * 
 * 3. 使用：
 *  3.1 可以利用"super.Field" or "super.Method"的方式，調用父類別當中所聲明的fields or methods。通常情況下可以省略super.
 *  3.2 在特殊情況下，subclass和parent class有了同樣名稱的fields，但我們想要在subclass當中調用parent裡面的field的話，需要使用"super.field"的方式，表明為parent class當中的fields
 *  3.3 特殊情況下，subclass rewrite the methods in parent class，若需要調用parent class中的method，則使用"super.Methods"來去調用parent class當中的methods
 * 
 * 4. 調用Contstructor:
 *  4.1 可以在subclass的constructor當中使用"super(params)"的方式，調用parent class當中指定的constructor
 *  4.2 "super(params)"必須declare在subclass的首行
 *  4.3 在class的constructor當中，針對"this(params)"以及"super(params)"只能二選一，不可以同時出現
 *  4.4 constructor的首行，沒有聲明this() 或是 super()，則會默認parent class當中沒有參數的constructor
 *  4.5 在class的多個constructors當中，至少有一個class的構造器使用了"super(params)"，用來調用parent class當中的constructor
 * 
 * Sub class實例化的過程：
 * 1. 從結果（繼承性）：
 *      subclass繼承parent class後，就會獲取parent class當中declare的fields以及methods
 *      創建subclass的對象，在heap當中，就會load in all parent class當中聲明的fields
 * 
 * 2. 從過程：
 *      當我們通過subclass創造object的時候，會直接或間接的調用parent class contstructor，直到調用了java.lang.Object中空參數的constructor為止
 * 
 * 注意：雖然創建subclass調用了parent class constructor，但從始自終都只有一個object，只是調用了多個constructors來做初始化
 * 
 * */
public class Super {
    public static void main(String[] args) {

    }
}