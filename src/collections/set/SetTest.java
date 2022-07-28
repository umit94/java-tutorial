package collections.set;

import java.util.HashSet;
import java.util.Set;

//TreeSet elemanlarını sıralı olarak tutarken, HashSet bir sıralama yapmaz ancak HashSet daha performanslıdır.
//add, remove, contains methodlarında HashSet O(1) performans sağlarken TreeSet, O(logn) performans sağlar.

public class SetTest {
    static String nameToAdd;
    static Set<String> names=new HashSet<>(); //Set aynı elemandan birden fazla içermez

    public static void main(String[] args) {
        addName("Kemal");
        System.out.println("\nAdded names");
        names.forEach((name)-> System.out.println(name));

        System.out.println();

        addName("Ümit");
        addName("Kemal"); //Aynı stringi tekrar ekleyemeyiz.
        System.out.println("\nAdded names");
        names.forEach(System.out::println);

        System.out.println("\nAdded names");
        Set<String> otherNames=new HashSet<>();
        otherNames.add("Kemal");
        otherNames.add("Muzaffer");
        names.addAll(otherNames); //Farklı elemanları ekler ancak aynı elemanları eklemez. "Kemal" tekrardan eklenmez, sadece bir tane bulunur.
        names.forEach(System.out::println);

    }

    static void addName(String name){
        if(names.add(name)){ //Set'in add methodu, aynı eleman yoksa eklemeyi yapar ve true döndürür
            System.out.println(name+" added");
        }
        else //Set'in add methodu, aynı eleman varsa eklemeyi yapmaz ve false döndürür
            System.out.println(name+" already exists");
    }
}
