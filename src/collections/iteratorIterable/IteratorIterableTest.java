package collections.iteratorIterable;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorIterableTest {
    public static void main(String[] args) {

        // Collectionlar sıralı değillerdir veya belli bir ifade üzerinden (key gibi) elemanlarına ulaşılamaz. Bu sebep ile iterator kullanılır.
        Collection<String> collection = new HashSet<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");


        System.out.println("First iterator");
        // Iterator, collection içerisinde gezmeyi sağlar.
        Iterator<String> iterator=collection.iterator(); // generic type verilebilir, verilmezse methodları Object üzerinden çalışır

        //collection.add("C"); // Iterator ile işlem yapılacak ise collection'a müdahale edilmemelidir yada işlemlerden önce/sonra müdahale edilmelidir.
        //collection.remove("A"); // Iterator ile işlem yapılacak ise collection'a müdahale edilmemelidir yada işlemlerden önce/sonra müdahale edilmelidir.



        while (iterator.hasNext()){ // hasNext, collection içerisinde bir sonraki elemanın olup olmadığını kontrol eder.
            String string = iterator.next(); // next, iterator'ın sonraki elemanını döndürür
            if(string=="C"){
                iterator.remove(); // Iterator'in o anki elemanı siler(next ile en son alınan eleman)
                break;
            }
            System.out.println(string);
        }

        System.out.println("\nSecond iterator");
        collection.add("D"); // Önceki iterator işleminden sonra collectiona müdahale edebiliriz. Ancak önceki iterator'ı tekrar kullanmamalıyız.
        iterator=collection.iterator(); // yeni iterator nesnesi ile tekrar collection içerisinde dolanabiliriz
        while (iterator.hasNext()){
            String string = iterator.next();
            System.out.println(string);
        }

        //----Iterable----
        //Collection iterable interface'ini implement eder. Iterable forEach default methoduna ve iterator, spliterator abstract methodlarına sahiptir.

        System.out.println("\nIterable's forEach");
        collection.forEach((el)-> System.out.println(el)); //Iterable'ın forEach methodu aynı aşağıdaki gibi bir for-each döngüsü oluşturmakta
        // ve Consumer'ı tipinde nesne almaktadır (tabii ki lambda expression verilebilir)


        System.out.println("\nManuel forEach");
        for (String str:collection) {
            System.out.println(str);
        }

        //----Iterable----
    }
}
