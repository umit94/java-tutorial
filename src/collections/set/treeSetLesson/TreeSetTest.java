package collections.set.treeSetLesson;

import collections.comparableComparator.NotComparableClass;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        //TreeSet elemanları sıralı şekilde tutar. add methodu ile ekleme yapıldığında tekrardan sıralama yapar.
        //Ancak bu sıralama index ile karıştırılmamalı. Setlerde index yoktur.
        //TreeSet'in sıralama yapabilmesi için geçilen class'ın comparable olması gereklidir veya TreeSet'e bir comparator geçilmelidir.


        //---Comparable---

        System.out.println("Comparable String");
        Set<String> comparableClassSet=new TreeSet<>();
        comparableClassSet.add("x");
        comparableClassSet.add("b");
        comparableClassSet.add("g");
        comparableClassSet.add("a");
        comparableClassSet.forEach(System.out::println);

        //---Comparable---


        //---NotComparable---

        System.out.println("\nNot Comparable Class - Sorted By No");
        Comparator<NotComparableClass> compareByNo = (e1, e2)-> { //no'ya göre compare eder
            if(e1.getNo() > e2.getNo())
                return 1;
            else if (e1.getNo() == e2.getNo())
                return 0;
            else
                return -1;
        };

        Set<NotComparableClass> notComparableClassSet=new TreeSet<>(compareByNo); // Set'e geçilen class comparable olmadığı için comparator geçmek zorundayız
        notComparableClassSet.add(new NotComparableClass("Rıza",3));
        notComparableClassSet.add(new NotComparableClass("Ahmet",5));
        notComparableClassSet.add(new NotComparableClass("Cumali",1));
        notComparableClassSet.forEach((element)-> System.out.println(element.getName()+" "+element.getNo()));


        System.out.println("\nNot Comparable Class - Sorted By Name");
        Comparator<NotComparableClass> compareByName=(e1,e2)->e1.getName().compareTo(e2.getName());
        Set<NotComparableClass> notComparableClassSet1=new TreeSet<>(compareByName);
        notComparableClassSet1.add(new NotComparableClass("Rıza",3));
        notComparableClassSet1.add(new NotComparableClass("Ahmet",5));
        notComparableClassSet1.add(new NotComparableClass("Cumali",1));
        notComparableClassSet1.forEach((element)-> System.out.println(element.getName()+" "+element.getNo()));

        //---NotComparable---
    }
}
