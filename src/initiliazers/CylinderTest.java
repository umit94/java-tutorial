package initiliazers;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.calculateCircumference());
        System.out.println(cylinder.calculateArea());
        System.out.println(cylinder.calculateVolume());
        Cylinder clonedCylinder = cylinder.clone();
        System.out.println(clonedCylinder.calculateVolume());
        System.out.println(Cylinder.getCountOfCreatedCylinders());
    }
}
