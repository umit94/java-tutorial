package abstractLesson;

import abstractLesson.food.Burger;
import abstractLesson.food.Food;
import abstractLesson.food.Pizza;

public class Test {
    public static void main(String[] args) {
        //Food food = new Food(); //Food abstract class olduğu için nesnesi oluşturulamaz
        Food food = new Pizza();
        Pizza pizza = new Pizza();
        food.eat();
        pizza.eat();
        new Burger().eat();

        Food food1 = new Food() {
            @Override
            public void eat() {
                System.out.println("YEDIN BITIRDIN");
            }
        };
        food1.eat();
    }
}
