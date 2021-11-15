package ru.geekbrains.java_core1.HomeWork;

    public class Dog extends Animal{
        public Dog(String name) {
            super(name);
        }
        @Override
        public void run(int length) {
            if (length <= 500) {
                System.out.printf("%s: пробежал " + length + " метров", name);
                System.out.println();
            } else {
                System.out.printf("%s: не пробежал " + length + " метров", name);
                System.out.println();
            }
        }

        public void swim(int length){
            if (length <= 10) {
                System.out.printf("%s: проплыл " + length + " метров", name);
                System.out.println();
            } else {
                System.out.printf("%s: не проплыл " + length + " метров", name);
                System.out.println();
            }
        }

}

