package abstractLesson.food;

public class Pizza extends Food{
    @Override
    public void eat() { //abstract method'un implementation'ı yazılmak zorundadır
        System.out.println("Eating a pizza");
    }
}
