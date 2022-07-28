package collections.set.hashSetLesson;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        //HashSet'lerde elemanlar sıralı değildir. Ekleme sırasına göre sıralanmaz veya alfabetik vs. şekilde sıralı değildir.


        //HashSet'lerde aynılık kontrolü nesnenin equals ve hashCode methodlarına göre yapılır.
        // İlk hashCode methodu çağırılır ve hashcodelar aynıysa, equals çağırılır, hashcodelar farklıysa equals çağırılmaz.
        // Bu sebeple yazdığımız classlarda hashCode ve equals methodlarını override etmeliyiz.



        //---hashCode ve equals'ın override 'edilmiş' class örneği---

        System.out.println("hashCode and equals is overrided");
        Set<HashTestClassWithOverrides> mySet=new HashSet<>();
        mySet.add(new HashTestClassWithOverrides(3));
        mySet.add(new HashTestClassWithOverrides(3)); //hashCode'u bir üst satırdaki ile aynı ve equals methodundan true döndüğü için aynı olduğu kabul edilir ve set'e eklenmez.
        mySet.add(new HashTestClassWithOverrides(5));
        mySet.add(new HashTestClassWithOverrides(6));
        mySet.add(new HashTestClassWithOverrides(9));

        mySet.forEach((element)-> System.out.println(element.getId()));

        //---hashCode ve equals'ın override 'edilmiş' class örneği---





        //---hashCode ve equals'ın override 'edilmemiş' class örneği---

        System.out.println("\nhashCode and equals is 'not' overrided");
        Set<HashTestClassWithoutOverrides> mySet2=new HashSet<>();
        mySet2.add(new HashTestClassWithoutOverrides(3));
        mySet2.add(new HashTestClassWithoutOverrides(3)); //hashCode ve equals methodları override edilmediği için set'e eklenir.
        mySet2.add(new HashTestClassWithoutOverrides(5));

        mySet2.forEach((element)-> System.out.println(element.getId()));


        //---hashCode ve equals'ın override 'edilmemiş' class örneği---


        //---equals ve hashCode---

        System.out.println("\nWith Overrides");
        HashTestClassWithOverrides hashTestClassWithOverrides = new HashTestClassWithOverrides(3);
        HashTestClassWithOverrides hashTestClassWithOverrides2 = new HashTestClassWithOverrides(3);
        System.out.println("hashTestClassWithOverrides.equals(hashTestClassWithOverrides2)");
        System.out.println(hashTestClassWithOverrides.equals(hashTestClassWithOverrides2)); //equals methodu override edildiği için true
        System.out.println();
        System.out.println("hashTestClassWithOverrides.hashCode() = "+hashTestClassWithOverrides.hashCode()); //hashCode methodu override edildiği için alttaki ile aynı
        System.out.println("hashTestClassWithOverrides2.hashCode() = "+hashTestClassWithOverrides2.hashCode()); //hashCode methodu override edildiği için üstteki ile aynı


        System.out.println("\nWithout Overrides");
        HashTestClassWithoutOverrides hashTestClassWithoutOverrides = new HashTestClassWithoutOverrides(3);
        HashTestClassWithoutOverrides hashTestClassWithoutOverrides2 = new HashTestClassWithoutOverrides(3);
        System.out.println("hashTestClassWithoutOverrides.equals(hashTestClassWithoutOverrides2)");
        System.out.println(hashTestClassWithoutOverrides.equals(hashTestClassWithoutOverrides2)); // //equals methodu override edildiği için false
        System.out.println();
        System.out.println("hashTestClassWithoutOverrides.hashCode() = "+hashTestClassWithoutOverrides.hashCode()); //hashCode methodu override edilmediği için alttaki ile farklı
        System.out.println("hashTestClassWithoutOverrides2.hashCode() = "+hashTestClassWithoutOverrides2.hashCode()); //hashCode methodu override edilmediği için üstteki ile farklı

        //---equals ve hashCode---

    }
}
