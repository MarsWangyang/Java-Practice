package innerClassPack;

/**
 * 1. Java中允許將一個class A聲明在另一個class B當中，則class A就是inner class, class B是一個外部類
 * 
 * 2. 內部類的分類：成員內部類(static/non-static) vs. 局部內部類 （方法內、代碼塊內、構造器內)
 * 
 * 3. 成員內部類：
 * > 一方面作為外部類的成員：
 * --> 可以調用外部類的結構
 * --> 可以被static修飾
 * --> 可以被4種不同權限的修飾符號修飾(protected, private, public, default)
 * > 另一方面，作為一個類：
 * --> 類內可以定義屬性、方法、構造器等
 * --> 可以被final修飾，表示此類不能被繼承，也就是如果不用final，就可以被繼承
 * --> 可以被abstract修飾
 * 
 * 
 * 
 * 
 * 
 */

public class InnerClasTest {
    public static void main(String[] args) {
        // 創建Dog instance(static member inner class)
        Person.Dog dog = new Person.Dog();
        dog.show();
        // 創建Bird實例(non-static member inner class)
        // 非靜態的inner class必須要先有對象才能去進一步create inner class object
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();
        bird.display("Flower");
    }
}

class Person {
    String name;
    int age;

    public void eat() {
        System.out.println("ppl eat");
    }

    // static成員內部類
    static class Dog {
        String name;
        int age;

        public void show() {
            System.out.println("Dog show");
            // eat(); 會因為Person的eat()是非靜態，所以沒辦法調用
        }
    }

    // non-static 成員內部類
    protected class Bird {
        String name;

        public Bird() {

        }

        public void sing() {
            System.out.println("I am a bird.");
            eat(); // == Person.this.eat();
        }

        public void display(String name) {
            System.out.println(name); // 方法的arguments
            System.out.println(this.name); // inner class的field
            System.out.println(Person.this.name); // external class的field
        }
    }

    // 少見的方式
    /**
     * 在局部內部類的方法中(e.g. show()), 如果調用局部內部類所聲明的方法(e.g. method())中的局部變量(e.g. num)的話，
     * 要求此局部變量必須要是final的。
     */
    public void method() {
        // 局部變量
        int num = 10; // 本身是一個final
        // 局部內部類
        class AA {
            public void show() {
                // num = 20; 這會是一個final的，因為實際上因為class 以及 method本身的生命週期來看，num其實傳入的是一個copy
                System.out.println(num);
            }
        }
    }

    // 常見的局部內部類
    // 返回一個實現了Comparable interface的class object

    public Comparable getComparable() {
        // 方法一：
        // 創建一個實現了Comparable interface的class: 局部內部類
        // class MyComparable implements Comparable {
        // @Override
        // public int compareTo(Object o) {
        // return 0;
        // }

        // }
        // return new MyComparable();

        // 方法2:
        return new Comparable() {

            @Override
            public int compareTo(Object o) {
                // TODO Auto-generated method stub
                return 0;
            }
        };

    }

    {
        // 局部內部類
        class BB {

        }
    }

    public Person() {
        // 局部內部類
        class CC {

        }
    }
}