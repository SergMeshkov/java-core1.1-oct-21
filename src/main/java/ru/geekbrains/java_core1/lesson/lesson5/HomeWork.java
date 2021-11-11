package ru.geekbrains.java_core1.lesson.lesson5;

    public class HomeWork {
       public static void main(String[] args){
           Employee Employee1 = new Employee();
           Employee1.name = " Meshkov Sergey Andreevech";
           Employee1.post ="the tester";
           Employee1.email ="Wdsae333@mail.ru";
           Employee1.telephone ="+79179996611";
           Employee1.salary ="40000";
           Employee1.age = 29 ;
           System.out.println(Employee1.name);
           System.out.println(Employee1.post);
           System.out.println(Employee1.email);
           System.out.println(Employee1.telephone);
           System.out.println(Employee1.salary);
           System.out.println(Employee1.age);

           Employee Employee2 = new Employee("Petrova Sveta Sergeevna", "engineer", "Sveta@mail.ru", "+79270007712", "40000", 31);
           System.out.println(Employee2.name);
           System.out.println(Employee2.post);
           System.out.println(Employee2.email);
           System.out.println(Employee2.telephone);
           System.out.println(Employee2.salary);
           System.out.println(Employee2.age);

           Employee Employee3 = new Employee("Persunov Semen Semenovech", "engineer", "Semen@mail.ru", "+79277777712", "40000", 43);
           System.out.println(Employee3.name);
           System.out.println(Employee3.post);
           System.out.println(Employee3.email);
           System.out.println(Employee3.telephone);
           System.out.println(Employee3.salary);
           System.out.println(Employee3.age);

           Employee Employee4 = new Employee(" Gagarena Polena Vlademerovna", "engineer", "Polena@mail.ru", "+79267478561", "40000", 48);
           System.out.println(Employee4.name);
           System.out.println(Employee4.post);
           System.out.println(Employee4.email);
           System.out.println(Employee4.telephone);
           System.out.println(Employee4.salary);
           System.out.println(Employee4.age);


           Employee Employee5 = new Employee("Samohen Vektor Evanovech ", "engineer", "Vektor@mail.ru", "+79267906572", "40000", 54);
           System.out.println(Employee5.name);
           System.out.println(Employee5.post);
           System.out.println(Employee5.email);
           System.out.println(Employee5.telephone);
           System.out.println(Employee5.salary);
           System.out.println(Employee5.age);


           Employee[] Employee = new Employee [5];
           Employee[0] = new Employee(" Meshkov Sergey Andreevech", "the tester","Wdsae333@mail.ru", "+79179996611", "40000", 29);
           Employee[1] = new Employee("Petrova Sveta Sergeevna", "engineer", "Sveta@mail.ru", "+79270007712", "40000", 31);
           Employee[2] = new Employee("Persunov Semen Semenovech", "engineer", "Semen@mail.ru", "+79277777712", "40000", 43);
           Employee[3] = new Employee(" Gagarena Polena Vlademerovna", "engineer", "Polena@mail.ru", "+79267478561", "40000", 48);
           Employee[4] = new Employee("Samohen Vektor Evanovech ", "engineer", "Vektor@mail.ru", "+79267906572", "40000", 54);

           for (int i = 0; i <Employee.length ; i++) {
                if (Employee[i].anAge() >40 ){
                    Employee[i].printInfo();
                }
           }
   }
}