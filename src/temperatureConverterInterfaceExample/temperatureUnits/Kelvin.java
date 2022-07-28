package temperatureConverterInterfaceExample.temperatureUnits;

public class Kelvin extends Temperature {
    public Kelvin(float degree){
        super(degree);
    }
    @Override
    public String getTemperatureUnit(){
        return "K";
    }
}
