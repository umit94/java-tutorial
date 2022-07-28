package hidingOverrideSuper;

public class Test {
    public static void main(String[] args) {
        System.out.println("Parent");
        Parent parent = new Parent();
        parent.overRide();
        System.out.println("-------------");
        System.out.println("Child");
        Child child = new Child();
        child.overRide();

    }
}
