
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n ){
        name = n;
    }
}
class cellphone {
    public void ring(){
        System.out.println("Ringing....");
    }
    public void Vibrate(){
        System.out.println("Vibrating...");
    }
    public void Calling(){
        System.out.println("Calling...Yash(Orry)");
    }
}


public class Setter_getter {
    public static void main(String[] args) {

        Employee1 Khushi = new Employee1();
        Khushi.setName("Khushi Solanki");
        Khushi.salary= 210100;
        System.out.println("Question 1:- ");

        System.out.println("Employee Name :- " + Khushi.getName());
        System.out.println("Employee Salary is:- " + Khushi.getSalary());

        System.out.println("-x-x-x-x-x-x-x-x-x-x-x--");
        System.out.println(" ");
        System.out.println("Question 2:- ");

        cellphone moto = new cellphone();
        moto.ring();
        moto.Vibrate();
        moto.Calling();

    }
}
