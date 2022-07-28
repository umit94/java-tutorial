package inheritance;

import inheritance.package2.Child;
import inheritance.package2.Child2;

public class InheritanceTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.testMethod();
        //System.out.println(Child2.staticPublicX); //staticPublicX değişkeni Parent'ın bir static değişkeni olduğu için Child2'nin initiliazerı çağırılmaz, direkt Parent'ın initiliazerı çağırılır
        //System.out.println(new Child2().staticPublicX); //Burada bir nesne oluşturulduğu için Parent initiliazerı da çağırılır.
    }
}
