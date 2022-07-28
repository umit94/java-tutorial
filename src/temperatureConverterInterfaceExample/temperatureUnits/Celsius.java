package temperatureConverterInterfaceExample.temperatureUnits;

public class Celsius extends Temperature {
    public Celsius(float degree){
        super(degree);
    }
    @Override
    public String getTemperatureUnit(){
        return "C";
    }
}
