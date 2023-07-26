package com.qa.model;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Oh.Its you. Hello" + getName();
    }

    @Override
    public String move() {
        return "If you insist";
    }
    public String toString() {
        return "This Cat is named and aged the following" + super.toString();
    }
}
