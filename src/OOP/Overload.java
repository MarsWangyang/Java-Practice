package OOP;

/**
 * 方法的重載 (overload)
 * 
 * 1. 定義：Two or more methods witin a class with the same name, but parameter
 * type must be different
 * => 也就是說method signature must be unique (return type and excpetions are not
 * part of signature)
 * 口號：兩同一不同
 * - 兩同：同一個class, and method name
 * - 一不同：params 的 list, numbers, type不同
 * 
 * 2. 通過object調用method時，需要如何確定一個指定的方法？
 * name of method --> parameters
 */

public class Overload {

    // 以下都是overload methods
    public void getSum(int i, int j) {
        System.out.println(i + j);
    }

    public void getSum(double d1, double d2) {

    }

    public void getSum(int i, String s) {

    }

    public void getSum(String s, int i) {

    }

    public int getSum(int i, int j, int z) {
        return 1;
    }

}