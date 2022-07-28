package initiliazers;
import static java.lang.Math.pow; //static import ile classların static methodlarını veya static değişkenlerini import edip class üzerinden çağırmadan kullanabiliriz


public class Cylinder extends Object{
    static private int countOfCreatedCylinders=0;
    private double radius;
    private double height;

    //Çalışma sırası
    //constant staticler(final static a=3;) => static tanıtımlar => static initiliazerlar => instance tanitimlari => instance initiliazerlar => constructor

    {//Nesne değişkenleri için initializer. Sadece nesne oluşturulurken ve her nesne için bir kere çağırılır.
        System.out.println("instance initializer");
        testVar=3.12F; // Initializer blokları tanıtmalardan sonra çalıştığı için forward ref olmaz.
    }

    static{ //static değişkenler için initializer. Class için çağırılır ve sadece classın ilk kullanıldığı anda çağırılır. static initializer, instance initiliazerdan önce çağırılır
        System.out.println("static initializer");
        PI=3.14F; // Initializer blokları tanıtmalardan sonra çalıştığı için forward ref olmaz.
    }

    private float testVar=PI*3; //static değişkenler (class değişkenleri) nesne değişkenlerinden daha önce initialize edildiği için forward referance sorun çıkarmaz
    private static float PI=3.14F;


    public Cylinder(double radius, double height){
        this.radius=radius;
        this.height=height;
        Cylinder.countOfCreatedCylinders++;
    }

    //this(args) ile başka bir constructor çağırılabilir. Bu sayede aynı kodları tekrar yazmaktan kurtuluruz. this() den önce başka bir statement yazılamaz.
    public Cylinder() {
        this(10,10);
    }

    public Cylinder(double radius){
        this(radius,10);
    }

    public double calculateArea(){
        return pow(radius,2)*PI;
    }
    public double calculateCircumference(){
        return 2*PI*radius;
    }
    public double calculateVolume(){
        double area = calculateArea();
        return area*height;
    }

    public Cylinder clone(){
        return new Cylinder(this.radius,this.height);
    }

    public static int getCountOfCreatedCylinders() {
        return countOfCreatedCylinders;
    }
}
