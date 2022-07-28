package mathRandom;

import java.util.Random;

public class Test
{
    public static void main(String[] args) {
        Random random =  new Random();
        System.out.println(random.nextInt()); // tüm int aralığı arasında negatif pozitif
        System.out.println(random.nextInt(40)); //40 hariç

        System.out.println((int) (Math.random()*100)); //100 hariç


    }
}
