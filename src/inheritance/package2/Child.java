package inheritance.package2;

import inheritance.package1.Parent;

public class Child extends Parent {
    {
        System.out.println("Child init");
    }
    public Child(){
        super(3);
    }
    public void testMethod(){
        int nonStatic;
        //a = defaultX; //default olduğu için paket dışından erişilemez.
        nonStatic=protectedX; //protected paket içerisinden ve herhangi bir child classdan (paket farketmeksizin) erişilebilir
        nonStatic=publicX;


        int staticX;
        //staticX = staticDefaultX; //default olduğu için paket dışından erişilemez.
        staticX = staticPublicX;
        staticX = staticProtectedX;

        Parent parent = new Parent(3);
        int accessX;
        //accessX = Parent.staticDefaultX; //default olduğu için paket dışından erişilemez.
        accessX = Parent.staticPublicX;
        accessX = Parent.staticProtectedX;
        accessX=parent.publicX;

        Parent.staticProtectedX=3;
        System.out.println("Parent.staticProtectedX="+Parent.staticProtectedX+" staticProtectedX="+staticProtectedX);
    }
}
