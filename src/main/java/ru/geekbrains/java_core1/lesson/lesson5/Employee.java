package ru.geekbrains.java_core1.lesson.lesson5;

public class Employee {
     String name;
     String post;
     String email;
     String telephone;
     String salary;
     int age;


     public Employee() {

     }

     public Employee(String aName, String aPost, String aEmail, String aTelephone, String aSalary, int anAge) {
          name = aName;
          post = aPost;
          email = aEmail;
          telephone = aTelephone;
          salary = aSalary;
          age = anAge;

     }

     public int anAge() {  //Создали "геттер" для "age"
          return age;
     }
     public void printInfo(){
          System.out.println("name" + name+ "post" + post + "email"+email+"telephone" + telephone + "salary" + salary + "age "+age);
     }
}