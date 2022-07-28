package classCasting.student;

public class Student {
    protected String name;
    protected int no;
    protected String branch;
    protected Student(String name, int no,  String branch){
        this.name=name;
        this.no=no;
        this.branch=branch;
    }

    public void doSomething(){}
    public void printInfo(){
        System.out.println("Name: "+name+" No: "+no);
    }
}
