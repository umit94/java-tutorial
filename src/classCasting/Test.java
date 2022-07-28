package classCasting;

import classCasting.student.HighSchooler;
import classCasting.student.Student;
import classCasting.student.UniversityStudent;

public class Test {
    public static void main(String[] args) {
        Student student = StudentArchive.getARandomStudent();

        //Özelden genele doğru yazılmalıdır, çünkü ilk genel yazılırsa ilk if e girer ve type kontrolünü doğru yapamayız
        if(student instanceof HighSchooler highSchooler) //Java 15'de gelen özellikle beraber bu şekilde daha kolay downcasting yapılabilir
            highSchooler.setBranch("Math");
        else if(student instanceof UniversityStudent) {
            UniversityStudent universityStudent = (UniversityStudent) student; //Java 15'den önceki sürümlerde downcasting böyle yapılır.
            universityStudent.setLanguage("English");
        }
        else if(student instanceof Student) //Genel olan sona yazılır
            student.doSomething();

        student.printInfo();
    }
}
