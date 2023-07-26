package com.qa;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat C1 = new Cat("Bubbles", 10);
        Cat C2 = new Cat("Buttons", 12);
        Dog D1 = new Dog("Tommy", 7);
        Rabbit R1 = new Rabbit("Fluffles", 5);
        Rabbit R2 = new Rabbit("Snuffles", 6);
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(C1);
        System.out.println(animalList);
        for(Animal animals: animalList){
            C1.move();
        }
        System.out.println(animalList);
    }
}
