package OOP;

/**
 * this關鍵字的使用：
 * 1. 可以理解為“當前的對象”
 * 2. this可以用來修飾：Fields, Method, Constructor
 * 3. 在class methods or
 * contstructor當中，我們可以使用"this.Field"或是"this.Method"的方式，調用當前object的fields,
 * methods。但是通常情況下我們都會忽略"this."特殊情況下，如果方法的params和class
 * Fields的名稱相同時，我們就必須用this.variable的方式，來表此this.variable是Field，而非parameters
 * 4. 用this來調用constructor
 * - 可以使用this(params)來調用指定本class的constructors
 * - constructor不能通過"this(params)"調用自己，只有create a object only
 * - 如果一個class中有n個constructors，那麼最多有n - 1個使用this(params)
 * - 規定："this(params)"一定需要聲明在constructor的first statement
 * - constructors內部，最多只能調用、聲明一個"this(params)"
 */
public class This {
    public static void main(String[] args) {

    }
}

// class Person {
// private String name;
// private int age;

// public Person() {
// this.eat();
// // Person initialzation的時候，需要考慮... (共 40 lines)
// }

// public Person(String name) {
// this(); // 這樣就會去調用Person()當中的所有code
// this.name = name;
// // Person initialzation的時候，需要考慮... (共 40 lines)
// }

// public Person(int age) {
// this();
// this.age = age;
// // Person initialzation的時候，需要考慮... (共 40 lines)
// }

// public Person(String name, int age) {
// this(age); // 這樣會去調用public Person(int age)這個constructor
// this.name = name;
// // Person initialzation的時候，需要考慮... (共 40 lines)
// }

// public void setName(String name) {
// this.name = name;
// }

// public String getName() {
// return name;
// }

// public void setAge(int age) {
// this.age = age;
// }

// public int getAge() {
// return age;
// }

// public void eat() {
// System.out.println("Person eats");
// this.drink();
// }

// public void drink() {
// System.out.println(
// "Person drinks");
// }
// }