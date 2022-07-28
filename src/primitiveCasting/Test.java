package primitiveCasting;

public class Test {
    public static void main(String args[]){
        final int intNumber=5;
        final float floatNumber=3.23F;
        final char charVar='3';

        final double doubleNumber=3.24252831D;
        System.out.println((float) doubleNumber);
        System.out.println((double) floatNumber);
        System.out.println((int) charVar);

        System.out.println("Float işlemler");
        System.out.println(5/2);
        System.out.println((float) 5/2);
        System.out.println(5F/2);
        System.out.println(5/2F);
    }
}
