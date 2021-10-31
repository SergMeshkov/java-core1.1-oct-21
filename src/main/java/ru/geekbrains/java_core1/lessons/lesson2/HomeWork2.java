package ru.geekbrains.java_core1.lessons.lesson2;

public class HomeWork2 {
    public static void main(String[] args) {
        //       clculate(20,5);
        //       number(10);
        //       entirely();
        //       truis();
                  System.out.println(year(1900));
    }

    public static void clculate(int a, int b) {
        if ((a + b) <= 9) {
            System.out.println("false");
        } else if ((a + b) > 20) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public static void number(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("отрицательное число");
        }
    }

    public static boolean entirely(int a) {
        boolean result = a < 0;
        return result;

    }


    public static void truis( String doom, int a){
        for (int i = 0; i < a; i++){
            System.out.println(doom + i);
        }
    }
    public static boolean year(int year){
         if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
             return true;
         }else {
             return false;
         }
    }
}
