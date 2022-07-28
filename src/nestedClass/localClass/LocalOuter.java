package nestedClass.localClass;

public class LocalOuter {
    int ab=3;

    public void createInner(final int a, int b, int c){
        int d=4;
        final int e=5;
        int f=6;
        f++; //değiştirildiği için effectively final değildir
        class Inner{
            void doSomething(){
                System.out.println("a="+a+" b="+b+" c="+c+" d="+d+" e="+e);
                //System.out.println(f); //yalnızca final veya effectively final yerel değişkenleri kullanabiliriz. effectively final=tanımlandıktan sonra değiştirilmemiş olan
                // d++; //final veya effectively final olma durumunu bozamayız
                ab++; //member değişkenlerin final veya effectively final olmasına gerek yoktur.
            }
        }

        Inner inner = new Inner();
        inner.doSomething();
    }
}
