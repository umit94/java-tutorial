package inheritance.package1;

public class Parent {
    static{
        System.out.println("Parent Initiliazing");
    }
    public Parent(){
        System.out.println("Parent const");
    }
    protected int protectedX=1;
    public int publicX=1;
    int defaultX=1;

    protected static int staticProtectedX=1;
    public static int staticPublicX=1;
    static int  staticDefaultX=1;

    public Parent(int publicX){
        this();
        this.publicX=publicX;
    }
}
