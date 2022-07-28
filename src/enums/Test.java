package enums;

public class Test {
    public static void main(String[] args) {
        Days day = Days.MONDAY;

        //Çeşitli methodlar ile diğer verilerine erişebiliriz
        System.out.println(Days.MONDAY+" "+Days.MONDAY.ordinal()+" "+Days.MONDAY.getTurkish()+" "+Days.MONDAY.getDayOfWeek());

        Days day2 = Days.MONDAY;
        System.out.println(day==day2); //Nesnelerin aksine çift eşit ile kontrol yapılabilir

        for(Days d:Days.values()){
            System.out.println(d);
        }
    }
}
