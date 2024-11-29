package Codewithharry;

class Employee{
    int id;
    String name;
    int salary;

    public void Printdetails(){
        System.out.println("Employee id is :- " + id);
        System.out.println("Employee name is :- " + name);
        System.out.println("Salary is :- " + salary);
    }
}

public class cwh_class_objects {
    public static void main(String[] args) {

        System.out.println("This is a custom class :");
        System.out.println("-x-x-x-x-x-x-x-x-");
        System.out.println("");


        Employee jay = new Employee();
        Employee pooja = new Employee();

        jay.id = 123;
        pooja.id = 345;

        jay.name = "JAY KABADI";
        pooja.name = "POOJA KABADI";

        jay.salary = 75000;
        pooja.salary = 60000;

        jay.Printdetails();
        System.out.println(" ");
        pooja.Printdetails();

    }
}
