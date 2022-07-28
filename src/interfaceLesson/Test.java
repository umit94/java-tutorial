package interfaceLesson;

import interfaceLesson.Employee.Employee;
import interfaceLesson.Employee.Worker;

import java.util.Arrays;
import java.util.Timer;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Employee(); // interface'in bu durumda class'dan hiçbir farkı yoktur
        Employee employee = new Employee();
        if(employee instanceof Worker) // interface'in bu durumda class'dan hiçbir farkı yoktur
            System.out.println("Yes, it is a worker");

        //---------Interface Static Variable (Constant)---------------
        System.out.println("Works at "+Employee.WORK_PLACE);

        //----------Karşılaştırma(Sort)----------
        Employee[] employees = {new Employee(2),new Employee(15), new Employee(10)};
        Arrays.sort(employees); // Comparable interface'ine sahip classlar için uygulanabilir
        for(Employee employee1:employees)
            employee1.printNo();


        //----------Interface Static Method----------
        Worker.aMethod();
        //Employee.aMethod(); //aMethod Worker interface'i üzerinde bir statik method olduğu için implement eden classlar tarafından çağırılamaz

    }

}
