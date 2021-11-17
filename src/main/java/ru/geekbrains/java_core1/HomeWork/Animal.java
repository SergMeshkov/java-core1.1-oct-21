 package ru.geekbrains.java_core1.HomeWork;

public class  Animal {
        String name;

        public Animal() {
        }

        public Animal(String name) {
                this.name = name;
        }

        public void run(int length) {
                System.out.printf("%s: пробежал "+ length+" метров", name);
                System.out.println();
        }
        public void swim(int length) {
                System.out.printf("%s: проплыл "+length+" метров", name);
                System.out.println();
        }


}
