package lambaExpression;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    static int staticX=3;
    int instanceX=3;
    public static void main(String[] args) {
        Instrument instrument = new Instrument();

        // Lambda expression ile çok daha kısa şekilde Playable'ı implement eden bir class oluşturup play methodunu override ettik.
        // Playable interface'inde birden fazla `implement edilmesi gereken` method olsaydı bu yöntemi kullanamazdık. Functional interface olmak zorundadır.
        Playable playable = ()-> {
            System.out.println("Created a new class and overrided the play method by using a lambda expression");
        };

        instrument.playInstrument(playable);

        // Referansa atamadan da kullanabiliriz.
        instrument.playInstrument(()-> System.out.println("I'm playing an instrument"));

        // Anonymous class oluşturarak uzun yoldan yaptık. Playable interface'inde birden fazla `implement edilmesi gereken` method olsaydı bu yöntemi kullanmak zorunda kalırdık.
        instrument.playInstrument(new Playable() {
            @Override
            public void play() {
                System.out.println("Overrided the play method by using an anonymous class");
            }
        });

        // (String tune)->...... şeklinde yazılabileceği gibi aşağıdaki gibi daha kısa şekilde yazılabilir.
        instrument.tuneInstrument(tune-> System.out.println("Tuned to "+tune),"A#");

        // ()->{return a} = ()->a //Javascript gibi


        int a=3;
        int b=3;
        b++;
        instrument.tuneInstrument(tune->{
            //anonymous class içerisinde veya lambda expression içerisinde kullanılacak olan local variablelar final veya effectively final olmalı
            //int x=b; // b final veya effectively final olmadığı için kullanılamaz
            //a++; // final veya effectively final olma durumunu bozamayız
        },"A");


    }

    void memberVarUsage(){
        new Instrument().tuneInstrument(tune->{
            //member variableların final veya effectively final olmalarına gerek yoktur.
            int a = staticX;
            staticX++;
            instanceX++;
            this.instanceX++; //this ile lambda expression içerisinde tanımlanan değişkenlere değil, içinde bulunduğu nesnenin değişkenlerine ulaşırız
        },"A");
    }
}
