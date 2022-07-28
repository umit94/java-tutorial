package hidingOverrideSuper;

//Neden değişkenleri daha düşük kapsamlı bir access modifier ile gizleyebilir iken methodları daha düşük bir access modifier ile override edemiyoruz?

public class Child extends Parent{
    private int publicX=0;
    private String staticX=""; //Gizleme - hiding parentın staticX adlı değişkeni gizlenmiş olur.
    public Child(){}


    //static methodlar için hiding olarak adlandırılırken static olmayan methodlar için overriding olarak adlandırılır
    //static methodlar static methodları, static olmayanlar static olmayanları hide ve override eder
    public static void hiding(){} // Hiding

    public void overRide() { //Ezme - overriding
        System.out.println("Overrided");
    }

    public void testMethod(){ //Parentın gizlenen staticX değişkenine ulaşmak için aşağıdakiler yapılabilir
        //System.out.println(super.staticX); //parentın static methodlarına veya değişkenlerine class ismiyle ulaşmak daha uygundur.
        System.out.println(Parent.staticX); //parentın static methodlarına veya değişkenlerine class ismiyle ulaşmak daha uygundur.
    }

    //public void cantBeOverrided(){} //Parent'da cantBeOverrided methodu final olarak tanımlandığından bu method override edilemez
}
