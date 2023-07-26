package com.qa.model;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Oh hello" + getName();
    }

    @Override
    public String move() {
        return "Runn!!";
    }

    @Override
    public String toString() {
        return "Dog{}"+super.toString();
    }
}
