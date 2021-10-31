package ru.geekbrains.java_core1.lessons.lesson2;

public class Classwork {
   static int classIntVariable = 15;
    public static void main(String[] args) { //psvm
//        methodsExample();
//        vendingWithIfs();
//        vendingWithSwitch();
//        vendingWithSwitchModern();
//        whileExample();
//        doWhileExample();
//        forLoopExample();
//        forLoopDouble();
//        arraySimpleExample();

        String[] strings = {
                "March",
                "April",
                "May",
                "June",
        };

        for (String s : strings){ //iter
            System.out.println(s);
        }
    }

    private static void arraySimpleExample() {
        int[] arr;
        arr = new  int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 110;
        arr[4] = 5;

        arr[1] = (arr[1] + arr[3]) / arr[2];
        System.out.println(arr[1]);

//        System.out.println(arr[5]);
        System.out.println(arr.length);

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 4};

        for (int i = 0; i < arr1.length; i++){ //fori
            arr1[i] *= 2;
        }
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = arr1.length - 1; i >= 0; i--){
            System.out.print(arr1[i] + " ");
        }
    }

    private static void forLoopDouble() {
        mySuperPuperCrazyLabel: //label Not recommended

        for (int i = 0; i < 10; i++){
            System.out.printf("Exercise #%d:", i);
            for (int j = 1; j < 11; j++){
                 System.out.print(j + " ");
                 if (j == 4){
                     break mySuperPuperCrazyLabel;
                 }
            }
            System.out.println();
        }
    }

    private static void forLoopExample() {
        // init              ; condition              ; iteration
        for (int a = 0, b = 10, c = 100; a < 10 && b > 0 && c > 10;a++, b--, c -= 10){
            System.out.printf("a = %d, b = %d, c = %d\n", a, b, c );
        }
        for (int i = 0; i < 15; i++){
            System.out.println(i);
            if (i == 5){
                break;
            }
        }
        int counter = 1;
        for (;;counter++){
            System.out.println(counter);
            if (counter > 10){
                break;
            }
        }
    }

    private static void doWhileExample() {
        int counter = 1;
        do {
            System.out.println(counter++);
        } while (counter < 11);
    }

    private static void whileExample() {
        int counter = 1;


        //           while (counter < 21){
        //           while (true) {
        while (counter < 0) {
                    counter++;

            if (counter % 3 == 0){
                continue;
            }
            System.out.println(counter);
            if (counter == 10){
//                break;
            }
        }
    }

    public static void vendingWithSwitchModern(){ //Java 14+
        var choice = 4;

        switch(choice) {
            case 1 -> System.out.println("Give Lays");
            case 2 -> System.out.println("Give Cheetos");
            case 3 -> System.out.println("Give Coca cola");
            case 4 -> {
                System.out.println("Give Pepsi");
                //....
            }
            case 5 -> System.out.println("Give Snickers");
            default -> System.out.println("Error. Try again");
        }
        System.out.println(classIntVariable);
    }

    public static void vendingWithSwitch(){
    int choice = 43;

       switch(choice) {
           case 1:
           case 8:
           case 24:
           case 43:
               System.out.println("Give Lays");
               break;
           case 2:
               System.out.println("Give Cheetos");
               break;
           case 3:
               System.out.println("Give Coca cola");
               break;
           case 4:
               System.out.println("Give Pepsi");
               break;
           case 5:
               System.out.println("Give Snickers");
               break;
           default:
               System.out.println("Error. Try again");
       }
    }

    public static void vendingWithIfs(){
        int choice = 2;
        if (choice == 1){
            System.out.println("Give Lays");
        }else if (choice == 2){
            System.out.println("Give Cheetos");
        }else if (choice == 3){
            System.out.println("Give Coca cola");
        }else if (choice == 4){
            System.out.println("Give Pepsi");
        }else if (choice == 5){
            System.out.println("Give Snickers");
        }else {
            System.out.println("Error. Try again");
        }
    }

    private static void methodsExample() {
        printSomethingIntroConsole();
        printArgumentValueIntroConsole("Hello");

        double somNumber = calculateSomeExpression(.24, 5.25);
    }

    public static void printSomethingIntroConsole() {
        System.out.println("Something");
    }

    public static void printArgumentValueIntroConsole(String word) {
        System.out.printf("Your argument was: %s\n" , word);//souf
    }
    public static double calculateSomeExpression(double firstValue, double secondValue){
        double result = firstValue / secondValue;
        System.out.printf("Calculating..."); //sout
//        System.out.printf("first value:" + firstValue +"; second value:" + secondValue + ";result is:" + result);
//         System.out.printf("First value: %f; second value: %f: result is: %f\n", firstValue,secondValue, result );
        String s =String.format("First value: %.02f; second value: %f: result is: %f\n", firstValue,secondValue, result);
        /*
        * %s - string and universal
        * %d - integers
        * %f - floats
        * %c - characters
        * %b - boolean
         */
        System.out.print(s);
        return result;
    }
}
