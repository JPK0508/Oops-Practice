package Anonymous_lambda;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
//        Without Java Generics :

        ArrayList myArrayList = new ArrayList();
        myArrayList.add(10);  //Integer value
        myArrayList.add("Harry Bhai!"); //String value
        myArrayList.add(20.4); //Double value

        int x = (int) myArrayList.get(0); //b=object typecasted into integer
        System.out.println(x);

    }

}


