class employee2{

    private int id;
    private String name;
    private int salary;

    public employee2(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void employee2(){
        id=20;
        name = "jay";

    }
    public employee2(String myname, int id1){
        id = id1;
        name= myname;
    }
    public employee2(int sal ){
        salary =  sal;
    }
    public String getName () {return name;}
    public void setName(String n) {this.name = n;}
    public int getId () {return id;}
    public void setId (int i) {this.id = i;}
    public int getSalary () {return salary;}
    public void setSalary (int salary) {this.salary = salary;}



}
    class Constructors {

        public static void main(String[] args) {

            employee2 hii = new employee2("pooja",12);
            employee2 bye = new employee2(120000);
           // hii.setId(25);
            System.out.println(hii.getName());
            System.out.println(hii.getId());
            System.out.println(bye.getSalary());


        }
    }