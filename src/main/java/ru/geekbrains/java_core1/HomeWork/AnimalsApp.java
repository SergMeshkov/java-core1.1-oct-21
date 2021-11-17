package ru.geekbrains.java_core1.HomeWork;

public class AnimalsApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsick");
        cat1.run(100);
        cat1.swim(200);

        Dog dog1 = new Dog("Max");
        dog1.run(550);
        dog1.swim(5);

        Cat cat2 = new Cat("Murzic");
        cat2.run(35);

    }
}