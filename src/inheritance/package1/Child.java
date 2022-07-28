package inheritance.package1;

public class Child extends Parent {
    public Child(){
        super(3);
    }
    public void testMethod(){
        int nonStatic = defaultX;
        nonStatic=protectedX;
        nonStatic=publicX;

        int staticX = staticDefaultX;
        staticX = staticPublicX;
        staticX = staticProtectedX;


    }
}
