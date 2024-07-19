package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        iterateAnimals(animals);
        iterateAnimals(pets);
        iterateAnimals(cats);
        iterateAnimals(dogs);
    }

    public static <T extends Animal> void iterateAnimals(List<T> animals) {

        for(Animal animal: animals) {

            System.out.println("Еще один шаг в цикле пройден!");
        }
    }
}

class Animal {

    public void feed() {

        System.out.println("Animal.feed()");
    }
}

class Cat extends Pet {

    public void meow() {

        System.out.println("Cat.meow()");
    }
}

class Dog extends Animal {
    public void bark() {

        System.out.println("Dog.bark()");
    }
}

class Pet extends Animal {

    public void call() {

        System.out.println("Pet.call()");
    }
}
