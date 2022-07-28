package interfaceLesson.Employee;

public interface Worker //extends Comparable<Employee>{ // Başka bir interface extend edilebilir
{
    String WORK_PLACE="Office"; // modifiersız default hali public final static'dir. Public constant değerler için kullanılabilir. Math.PI gibi. Override veya hide edilmezler.
    void work(); //modifiersız default hali public ve abstract'tır.
    //public abstract void doSomething(); //public ve abstract gereksizdir

    default void workMuch(){
        //default modifier'ı ile implementation verilebilir. publictir. override edilmek zorunda değildir
    }

    default void workHarder(){
       //Bu method OverrideTest interface'inde de olduğu için 'hem OverrideTest'i hem Worker'ı implement eden bir class' bu methodu override etmelidir
    }

    static void aMethod(){
        //Static methodlar override, hide edilemezler ve sadece interface üzerinden çağırılabilirler
    }

    private static void prvMethod(){
        // implementation verilen (default olan) methodların ortak işlerini yapmak için private method tanımlanabilir.
        // static modifier'ı opsiyoneldir ama static methodların da kullanabilmesi için static geçilebilir
    }

}
