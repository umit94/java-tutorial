package collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ListTest {

    public static void main(String[] args) {
        // Array'in boyutunun genişletilebilir daraltılabilir versiyonudur. Collection implementasyonu olduğu için iterabledır ancak elemanların indexleri de vardır.

        // LinkedList'de elemanlar, önündeki ve arkasındaki elemanları bilir. Dolayısıyla başa veya ortalara eleman ekleme yapılmak istendiğinde
        // sadece birkaç değişim ile (ileri ve geri linklerin gösterdiği referansların değişimi) hızlıca ekleme yapılabilir. Ancak indexlere ulaşırken performansı düşüktür.
        // ArrayList ise elemanları indexine göre tutar ve indexlere ulaşırken hızlıdır, ancak başa veya ortaya ekleme yaparken performansı düşüktür.
        // Yani başa veya ortalara ekleme yapmak istediğimiz zamanlarda LinkedList kullanabiliriz, sadece sona ekleme yapmak istediğimiz durumlarda ise
        // en ideali ArrayList kullanmaktır.


        int count=1_000_000;
        long startTime;
        long endTime;


        // Aşağıdaki örnekte görüldüğü gibi başa eklerken LinkedList daha performanslıdır, ancak sona eklemelerde ArrayList daha performanslıdır.

        //---ArrayList Performance---
        startTime=System.currentTimeMillis();
        List<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<count;i++){
            arrayList.add(0,i);
        }
        endTime=System.currentTimeMillis();
        System.out.println("ArrayList Add Time = "+(endTime-startTime));

        startTime=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            arrayList.get(999_999);
        }
        System.out.println();
        endTime=System.currentTimeMillis();
        System.out.println("ArrayList Access Time = "+(endTime-startTime));
        //---ArrayList Performance---



        //---LinkedList Performance---
        startTime=System.currentTimeMillis();
        List<Integer> linkedList = new LinkedList<>();
        for(int i=0;i<count;i++){
            linkedList.add(0,i);
        }
        endTime=System.currentTimeMillis();
        System.out.println("LinkedList Add Time = "+(endTime-startTime));

        startTime=System.currentTimeMillis();
        for(int i=0;i<count;i++){
            linkedList.get(999_999);
        }
        endTime=System.currentTimeMillis();
        System.out.println("LinkedList Access Time = "+(endTime-startTime));
        //---LinkedList Performance---
    }
}
