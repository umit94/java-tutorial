package classCasting;

import classCasting.student.HighSchooler;
import classCasting.student.Student;
import classCasting.student.UniversityStudent;

import java.util.Random;

public class StudentArchive {
    private static Student[] students=new Student[10];
    static {
        for(int i=0;i<10;i++){
            if(i%2==0)
                students[i]=new UniversityStudent("Uni"+i,i,"UniBranch"+i,"Lang"+i);
            else
                students[i]=new HighSchooler("High"+i,i,"HighBranch"+i);
        }
    }

    static Student getARandomStudent(){
        Random random = new Random();
        return students[random.nextInt(10)];
    }
}
