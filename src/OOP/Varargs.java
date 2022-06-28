package OOP;

/**
 * 可變個數的parameters, Varargs (variable number of arguments):
 * 允許直接定義和多個argument(實參)相匹配的parameters(形參)
 * 
 * 1. 具體使用:
 * 1.1 格式：dataType ... parametersName
 * 1.2 數量：arguments可以是>=0的數量
 * 
 */

public class Varargs {
    public static void main(String[] args) {
        Varargs arg = new Varargs();
        arg.show(2);
        arg.show("hello world");
        arg.show("hello", "world");

    }

    public void show(int i) {

    }

    public void show(String s) {

    }

    // 可變個數的parameters, 可以是>=0個參數的數量
    public void show(String... strs) {
        for (String string : strs) {
            System.out.println(string);
        }
    }

    // 這樣會造成Error，因為String... strs == String[] strs, 兩個方法是一樣的
    // public void show(String[] strs) {

    // }

    // The variable argument type String of the method show must be the last
    // parameter
    // Error
    // public void show(String... strs, int i) {

    // }
}