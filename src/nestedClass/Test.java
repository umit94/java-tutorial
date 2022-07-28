package nestedClass;

import nestedClass.anonymousClass.AnonymousClass;
import nestedClass.localClass.LocalOuter;
import nestedClass.memberInner.MemberOuter;
import nestedClass.staticInner.Outer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        //----static inner class----

        Outer.Inner inner = new Outer.Inner(5); //static inner class nesne oluşturma
        System.out.println(inner.getNo());

        Outer outer = new Outer(inner);
        System.out.println(outer.getInnerNo());

        //----static inner class----





        //----member inner class----

        MemberOuter memberOuter = new MemberOuter();
        MemberOuter.Inner inner2 = memberOuter.new Inner(3); //member inner class nesne oluşturma

        //----member inner class----






        //----local inner class----

        LocalOuter localOuter = new LocalOuter();
        localOuter.createInner(1,2,7);

        //----local inner class----




        //----anonymous class----

        AnonymousClass anonymousClass = new AnonymousClass() { //AnonymousClass bir interface'dir ve interfacelerin nesneleri olmaz veya constructor çağırıları yapılamaz
            // Ancak scope açarak bu interface'i implement eden isimsiz bir class (anonymous class) yazabiliriz
            @Override
            public void doSomething() {
                //interface içerisindeki methodlara implementation verilmelidir
            }
        };


        Timer timer = new Timer(5000, new ActionListener() { // Bu tip event listenerlarda kullanımı yaygındır
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("timer");
            }
        });
        timer.start();

        //----anonymous class----
    }

}
