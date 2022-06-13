package ploymorphism;

public class Man extends Person {
    boolean isSmoking;

    public void earnMoney() {
        System.out.println("Man earns money");
    }

    @Override
    public void eat() {
        System.out.println("Man eats");
    }

    @Override
    public void walk() {
        System.out.println("Man Walks");
    }
}