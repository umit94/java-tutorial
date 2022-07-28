package collections.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableComparatorTest {
    public static void main(String[] args) {

        //----Comparable----
        // Comparable olan listeler için kullanılır

        List<String> list=new ArrayList<>();
        list.add("Can");
        list.add("Ahmet");
        list.add("Mehmet");
        list.add("Abdullah");

        Collections.sort(list); // Generic'i comparable olan listelerde comparable'ın implement edilen compareTo methoduna göre sıralama yapar.
        // Bu örnekte String class'ı Comparable'ı implement etmektedir ve compareTo methodunu override etmektedir. String'in compareTo methoduna göre sıralama yapılır.

        list.forEach((str)-> System.out.println(str));

        //----Comparable----


        System.out.println();


        //----Comparator----
        // Comparable olmayan listeler için kullanılır veya Comparable olan ama farklı şekilde compare etmek istediğimizde kullanırız.

        List<NotComparableClass> notComparableList=new ArrayList<>();
        notComparableList.add(new NotComparableClass("Abdullah",5));
        notComparableList.add(new NotComparableClass("Can",4));
        notComparableList.add(new NotComparableClass("Ahmet",2));
        notComparableList.add(new NotComparableClass("Mehmet",1));
        notComparableList.add(new NotComparableClass("Abdullah",3));

        //Collections.sort(notComparableList); // NotComparableClass'ı Comparable olmadığı için bu şekilde sort edilemez

        System.out.println("Sort by name");
        Comparator<NotComparableClass> comparator=(e1,e2)->(Integer)e1.getName().compareTo(e2.getName()); // lambda expression ile compare methodunu belirleyebiliriz.
        Collections.sort(notComparableList,comparator); // Comparable olmayan classların listelerini sort etmek için listeyi ve comparator'u geçebiliriz.
        notComparableList.forEach((element)-> System.out.println(element.getNo()+" "+element.getName()));


        System.out.println("\nSort by no");
        Comparator<NotComparableClass> comparator2=(e1,e2)->e1.getNo()- e2.getNo();
        Collections.sort(notComparableList,comparator2);
        notComparableList.forEach((element)-> System.out.println(element.getNo()+" "+element.getName()));


        System.out.println("\nSort reversed by name and no");
        Collections.sort(notComparableList,comparator.reversed().thenComparing(comparator2)); // thenComparing ile daha fazla comparator ekleyebiliriz. reverse ile tersten sıralayabiliriz
        notComparableList.forEach((element)-> System.out.println(element.getNo()+" "+element.getName()));
        //----Comparator----

    }
}
