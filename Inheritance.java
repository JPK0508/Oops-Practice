package oops;

class parent{

    public void fathername(){
        System.out.println("Father name is :- PRAVIN KABADI");
    }
    public void mothername(){
        System.out.println("Mother name is :- PRIYANKA KABADI");
    }
}
class child extends parent{
    public void childname(){
        System.out.println("Child Name is :- JAY AND POOJA");
    }

    public void mothername(){
        super.mothername();
        System.out.println("Other name of mother :- MANISHA");

    }

}

public class Inheritance {
    public static void main(String[] args) {

        parent obj = new child();
        child obj1 = new child();

        obj.fathername();
        obj.mothername();
        obj1.childname();

    }
}
