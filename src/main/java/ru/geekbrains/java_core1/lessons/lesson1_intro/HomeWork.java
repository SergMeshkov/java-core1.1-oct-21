package ru.geekbrains.java_core1.lessons.lesson1_intro;

public class HomeWork {
    public static void  main(String[]args){
//        checkSumSign();
//        printThreeWords();
//        printColor();
//        compareNumbers();
    }
    public static  void printThreeWords(){
           System.out.println("Orange");
           System.out.println("Banana");
           System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 20;
        int b = 10;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static  void printColor(){
            int value = 20;
            if (value <= 0){
                System.out.println("Красный");
            }else if (value <= 100 ){
                System.out.println("Желтый");
            }else {
                System.out.println("Зеленый");
            }
        }
    public static void compareNumbers(){
        int a = 20;
        int b = 100;
        if (a >= b){
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }
    }

