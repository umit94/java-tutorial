package collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetMethodsTest {
    public static void main(String[] args) {
        //---of---

        Set<String> names = Set.of("Ahmet","Mehmet","Kemal","Elif"); //Unmodifiable (Immutable) set oluşturur. of kullanırken aynı elemanı iki kere geçmemeliyiz. null geçilmez
        //names.add("Abdullah"); //Immutable olduğu için exception fırlatır

        //---of---





        //--copyOf---

        Set<Object> surnames=new HashSet<>();
        surnames.add("Yılmaz");
        surnames.add("Dilsiz");
        surnames.add(new MyClass());
        Set<Object> copyOfSurnames=Set.copyOf(surnames); //Unmodifiable (Immutable) set oluşturur. Verilen collection'ın kopyasını oluşturur
        //copyOfSurnames.add("Mahmut"); //Immutable olduğu için exception fırlatır

        //--copyOf---

        //?????????????
        //copyOfSurnames'in bir elemanina yeni nesne atadigimda neden surnames'in nesnesi de degisiyor?
        // copyOfSurnames'e yeni referans atadim, surnames'de eski referans yok mu?
        copyOfSurnames.forEach((element)->{
            if(element instanceof MyClass myClass)
                myClass= new MyClass();

        });
        surnames.forEach((element)->{
            if(element instanceof MyClass myClass)
                myClass.setA(5);

        });
        copyOfSurnames.forEach((element)->{
            if(element instanceof MyClass myClass)
                System.out.println(myClass.getA());

        });

    }
}
