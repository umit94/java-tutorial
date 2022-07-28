package interfaceLesson.Employee;

public interface OverrideTest {

    default void workHarder(){
        //Bu method Worker interface'inde de olduğu için 'hem OverrideTest'i hem Worker'ı implement eden bir class' bu methodu override etmelidir
    }
}
