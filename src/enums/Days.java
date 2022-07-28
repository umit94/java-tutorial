package enums;

enum Days {
    MONDAY("Pazartesi",1), TUESDAY("Salı",2); //value sayısı kadar constructor çalıştırılır
    {
        System.out.println("Instance initiliazer"); //enumlarda classların tersine ilk önce instance initiliazer çalışır
    }

    static{
        System.out.println("Class initiliazer"); //enumlarda classların tersine ilk önce instance initiliazer çalışır
    }

    private String turkish;
    private int dayOfWeek;

    static int staticX=0;

    Days(String turkish, int dayOfWeek){
        this.turkish=turkish;
        this.dayOfWeek=dayOfWeek;
    }

    public String getTurkish(){
        return turkish;
    }

    public int getDayOfWeek(){
        return dayOfWeek;

    }
    static public int getStaticX(){
        return staticX;
    }

}
