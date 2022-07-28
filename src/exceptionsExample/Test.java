package exceptionsExample;

import exceptionsExample.citizen.Citizen;

public class Test {
    public static void main(String[] args) {
        try {
            Citizen citizen = new Citizen("2448807098");
            System.out.println("Successfully created");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
