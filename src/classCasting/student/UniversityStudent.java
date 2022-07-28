package classCasting.student;

public class UniversityStudent extends Student{
String language;
    public UniversityStudent(String name, int no, String branch,String language){
        super(name,no, branch);
        this.language=language;
    }

    public void setLanguage(String language){
        this.language=language;
    }

    @Override
    public void printInfo(){
        System.out.println("Name: "+name+" No: "+no+" Branch: "+branch+" Language: "+language);
    }
}
