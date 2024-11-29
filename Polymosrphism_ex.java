package oops;
interface camera2{
    void takesnap2();
    void shootvideo2();
}
interface wifi1{
    String [] shownetworks2();
    void connecttonetwork2(String network);
}

class phone2{
    void callnumber2(int phonenumber){
        System.out.println("Calling... " + phonenumber);
    }
    void pickcall2(){
        System.out.println("connecting... ");
    }
}
class MotorolaEdge401 extends phone2 implements camera2,wifi1{
    public void takesnap2(){
        System.out.println("Taking a Photo..");
    }
    public void shootvideo2(){
        System.out.println("Recording a video...");
    }
    public String [] shownetworks2(){
        System.out.println("Showing list of Networks..");
        System.out.println("\n");
        String [] networklist1 = {"JAY KABADI", "tp link" , "yash" , "D-link"};
        return networklist1;
    }
    public void connecttonetwork2(String network){
        System.out.println("Connecting to" + network);
    }
}





public class Polymosrphism_ex {
    public static void main(String[] args) {
        camera2 c = new MotorolaEdge401();  //this is called polymosrphism that youcan allow only one reference
        c.takesnap2();
        c.shootvideo2();
        //c.shownetworks2();           // it will not allowd other interface methods
    }

}
