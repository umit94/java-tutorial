package stringBuilder;

public class Test {
    public static void main(String[] args) {
//        String a = "deneme";
//        String b = "deneme"; // new ile oluşturulmadığında bellekte tutulan diğer "deneme" stringinin referansını alır, çünkü stringler immutable yani değiştirilemezdir ve sabitlerdir
//        String c = new String("deneme"); // new ile yeni bir obje içerisinde tutulur. Bellekte gereksiz yer kapladığı için önerilmez
//        System.out.println("a==b ? "+(a==b)); // true döner çünkü aynı referanslara sahiptir
//        System.out.println("a==c ? "+(a==c)); // false döner çünkü farklı referanslara sahiptir


        long start=System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("JAVA"); // + operatöründen daha performanslıdır.
        for(int i=0;i<100_000;i++) {
            sb.append(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);


        String java="JAVA";
        long start2=System.currentTimeMillis();
        for(int i=0;i<100_000;i++)
            java+=i;
        long end2=System.currentTimeMillis();
        System.out.println(end2-start2);

        System.out.println(java.equals(sb.toString()));
    }
}
