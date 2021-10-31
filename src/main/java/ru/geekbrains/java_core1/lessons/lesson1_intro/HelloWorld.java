package ru.geekbrains.java_core1.lessons.lesson1_intro;

//UpperCamelCase (PascalCase) SomExampleLongNamedClass
public class HelloWorld {

   public static void  main(String[]args){
//       printHelloWorld();
//       variables();
//       arithmeticsExample();
//       logics();
//       ifs();

       int a = 5 ;
       int b =10;
       int c =2;
//       int r = (a + b) / c;
      int r = clculate(a, b, c) ;

//       a = 34 ;
//       b = 234;
//       c = 12;
//      r = (a + b) / c;
r = clculate(314, 2134, 112);

//       a = 314 ;
//       b = 2134;
//       c = 112;
//       r = (a + b) / c;
       System.out.println(clculate(3242, 123, 43));
   }

   //camelCase someExampleLongMethodForsStudents
   public static int clculate(int a, int b, int c){
       return (a + b) / c;
   }

    private static void ifs() {
        int q = 15;
        boolean b = q < 10;


//       if (q == 1){
        if (!b) {
            System.out.println("Hello");
        }else if (q == 2){
            System.out.println("two");
        } else if (q < 10){
            System.out.println("<10");
        }else {
            System.out.println("else");
        }
    }

    private static void logics() {
        boolean b = 10 <= 11;
        b = 10 >= 11;
        b = 100 == 100;
        b = 100 != 500;
        b = !b;
        b = 10 < 20 && 15 > 10 && 5 < 8;
        b = 1 > 2 || 2 > 1 || 4 < 3 || 5 < 10;
        System.out.println(b);
    }

    private static void arithmeticsExample() {
        int a = 10;
        int b = 20;
        int c = 150;

        int q = a * b -c + (a + b) / 4;

        double d = div(10, 6);
        System.out.println(d);

        a += 10;// a = a + 10;
        a /= 2; // a = a / 2;
        a *= a; // a = a * a;

        a++;// a = a + 1;
        ++a;
        --a;//a = a - 1;
        a--;

        String s = "Hi";
        String s1 = s + " man" + "!";
        System.out.println(s1 + a);

        System.out.println(2 + 2 +1 + "very well");
        System.out.println("very well" + 2 + 2 +1 );
        System.out.println("very well" + (2 + 2 +1 ));
    }

    public static double div(float a, float b){
//       double result = a / b;
  //     return 0;
       return 1.0 * a / b;
   }

    private static void variables() {
        byte byteVariable;
        byteVariable = 20;
//       System.out.println(byteVariable);
        byte b = 14; // 1b 8 bit - 128..127
        short shortVar = 90; //2b -32768..32767
        int integerVar = 2_145_999_999;//4b -2.1b..2.1b
        long longVar = 1_999_999_222_545_999_999L;//8b

        double dobleVar = 10.1238; //8b
        float floatVar = 0.24f; //4b

        char charVar = 78; //2b 0..65535
        char charVar1 ='Q';
        char charVar2 ='\u0000';
        char charVar3 ='\u3278';
        System.out.println(charVar3);

        boolean boolVar = true;

        float f = 10.0f / 3;
        double d = 10.0 / 3;
        System.out.println("Double: " + d);
        System.out.println("Double: " + f);

        String stringVar =new String("Some");
        String s = "Hello";
        System.out.println(s);
        HelloWorld hw = new HelloWorld();


        //Java 10+ local variables only
        var somVar = "Hi";
    }

    public static void printHelloWorld(){
       System.out.println("hello world!");
       System.out.println("hello world!");
       System.out.println("hello world!");
       System.out.println("hello world!");
   }

}
