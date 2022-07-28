package lambaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class BuiltInFunctionalInterfacesTest {
    public static void main(String[] args) {

        //---- Built-in functional interfaceler----

        //java.util.function içerisindeki hazır functional interfaceler kullanılabilir



        //---Function---
        //Function, bir işlem yapıp son generic parametre tipinde değer döndürür. BiFunction'ın methodu (apply) iki argüman alır, Function ise tek argüman alır.

        BiFunction<Integer,Integer,Double> divideIntegers = (divided, divider)->(double)divided/divider;

        double result=divideIntegers.apply(3,5);

        System.out.println("3/5="+result);

        //---Function---





        //---Predicate----
        //Predicate, bir karşılaştırma yapıp boolean döndürür. BiPredicate'ın methodu (test) iki argüman alırken Predicate 1 argüman alır

        Predicate<String> isEmpty=(string)->string.length()==0;

        System.out.println("Is string empty? "+isEmpty.test(""));



        //---Predicate'in default methodlari

        Predicate<String> isLongEnough=string->string.length()>4; //string'in uzunluğu 4ten büyük olmalı
        Predicate<String> hasB=string->string.contains("b"); //string "b" stringini içermeli
        Predicate<String> andPredicates=isLongEnough.and(hasB); //Yukarıdaki iki koşulu and'liyoruz

        System.out.println("Is string length higher than 4 and does string have b in it? "+andPredicates.test("abuzer")); // Yukarıdaki her iki koşul da sağlandığı takdirde true döndürür


        //---Predicate'in default methodlari


        //---Predicate----



        //---Consumer----
        //Consumer, bir parametre alır ve hiçbir şey döndürmez.

        Consumer<String> printString=string-> System.out.println(string);
        printString.accept("Consumer example");

        //method referansı bu şekilde geçilebilir
        Consumer<String> printString2= System.out::println;
        printString2.accept("Consumer example2");

        //---Consumer----


        //---Supplier---
        //Supplier parametre almayıp geçilen tipte bir değer döndürür

        Supplier<Integer> createRandomInteger=()->{
            Random random = new Random();
            return random.nextInt();
        };

        System.out.println("Create random integer "+createRandomInteger.get());

        //---Supplier---





        //---andThen ve compose---
        //fonksiyonlari zincir gibi arka arkaya çağırmayı sağlar
        //firstFunc.andThen(secondFunc) ===> ilk firstFunc sonrasında secondFunc çağırılır
        //firstFunc.compose(secondFunc) ===> ilk secondFunc sonrasında firstFunc çağırılır

        Function<String, String> addQuestionMark=(string)->string+"?";
        Function<String,String> addExclamationMark=(string)->string+"!";
        String andThenResult=addExclamationMark.andThen(addQuestionMark).apply("And then-compose");
        String composeResult=addExclamationMark.compose(addQuestionMark).apply("And then-compose");
        System.out.println(andThenResult);
        System.out.println(composeResult);

        //---andThen ve compose---

        //---- Built-in functional interfaceler----

    }
}
