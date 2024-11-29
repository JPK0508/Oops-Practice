package oops;

interface camera{
    void takesnap();
    void shootvideo();
}
interface wifi{
    String [] shownetworks();
    void connecttonetwork(String network);


}


class phone{
    void callnumber(int phonenumber){
        System.out.println("Calling... " + phonenumber);
    }
    void pickcall(){
        System.out.println("connecting... ");
    }
}
class MotorolaEdge40 extends phone implements camera,wifi{
    public void takesnap(){
        System.out.println("Taking a Photo..");
    }
    public void shootvideo(){
        System.out.println("Recording a video...");
    }
    public String [] shownetworks(){
        System.out.println("Showing list of Networks..");
        System.out.println("\n");
        String [] networklist = {"JAY KABADI", "tp link" , "yash" , "D-link"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("Connecting to" + network);
    }
}

public class Interfaces_Ex {
    public static void main(String[] args) {
        MotorolaEdge40 newobj = new MotorolaEdge40();
        newobj.takesnap();
        newobj.shootvideo();
        String[] array = newobj.shownetworks();

        for (String aa : array){
            System.out.println(aa);
        }
        phone p = new phone();
        p.callnumber(703888);
        p.pickcall();
    }

}
