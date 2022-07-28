package classCasting.student;

public class HighSchooler extends Student{
    private String branch;
    public HighSchooler(String name, int no, String branch){
        super(name,no, branch);
    }

    public void setBranch(String branch){
        this.branch=branch;
    }

    @Override
    public void printInfo(){
        System.out.println("Name: "+name+" No: "+no+" Branch: "+branch);
    }
}
