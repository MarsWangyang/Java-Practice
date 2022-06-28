package OOP;

/**
 * 格式： class A extends B {}
 * A: subclass
 * B: superclass
 * => 體現：當subclass A繼承super class B之後，A就會獲取B當中declare所有的, fields, methods
 * => 特別：super class當中聲明為private的fields or methods，當sub class繼承super
 * class之後，仍然認為獲取了super class當中private的結構。
 * 不過因為有封裝性的影響，會使得sub class不能直接調用super class結構。
 * 
 * subclass繼承super class以後，還可以聲明自己特有的field or methods, 實現功能的拓展。
 * 
 * 規定：
 * 1. 一個class可以有多個sub class
 * 2. 單繼承性：一個class只能有一個super class => 不允許多重繼承
 * 3. class是可以多層繼承（sub and super class關係是相對的）
 * 4. sub class會直接獲取間接super class以及直接 super class的fields and methods
 * 
 */
public class Inheritance {
    public static void main(String[] args) {
        Person p1 = new Person("arx", 2);
        p1.age = 1;
        p1.eat();
        System.out.println("====================");

        Student s1 = new Student("Mars", 123, "EE");
        s1.name = "Mars";
        System.out.println(s1.name + " " + s1.age);
        s1.eat();
        s1.study();

    }
}

class Person {
    String name;
    int age;

    public Person() {
        System.out.println("helloworld");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor");
    }

    public void eat() {
        System.out.println("person eat");
    }

    public void sleep() {
        System.out.println("person sleep");
    }
}

class Student extends Person {
    // String name;
    // int age;
    String major;

    public Student() {

    }

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
        System.out.println("Student Contstructor");
    }

    @Override
    public void eat() {
        System.out.println("sudent eat");
    }

    @Override
    public void sleep() {
        System.out.println("sudent sleep");
    }

    public void study() {
        System.out.println("Learning");
    }
}