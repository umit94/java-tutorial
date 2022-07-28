package temperatureConverterInterfaceExample.temperatureUnits;

public class Fahrenheit extends Temperature {
    public Fahrenheit(float degree){
        super(degree);
    }
    @Override
    public String getTemperatureUnit(){
        return "F";
    }
}