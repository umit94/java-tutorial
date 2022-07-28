package lambaExpression;

public class Instrument {

    static void x(int a){

    }

    public void a(int y){
        System.out.println("INT : " + y);
    }

    public void playInstrument(Playable playable){
        playable.play();
    }

    public void tuneInstrument(Tunable tunable, String tune){
        tunable.tune(tune);
    }
}
