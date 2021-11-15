package ru.geekbrains.java_core1.HomeWork;

    public class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public void run(int length) {
            if (length <= 200) {
                System.out.printf("%s: пробежал " + length + " метров", name);
                System.out.println();
            } else {
                System.out.printf("%s: не пробежал " + length + " метров", name);
                System.out.println();
            }
        }

        public void swim(int length){
            System.out.printf("%s: не умеет плавать ", name);
            System.out.println();
        }

    }


