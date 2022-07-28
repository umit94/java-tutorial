package hidingOverrideSuper;

public class Parent {
    public int publicX=0;
    static int staticX=0;
    public Parent(){}

    static void hiding(){}

    public void overRide(){
        System.out.println("Not overrided");
    }

    final public void cantBeOverrided(){}
}
