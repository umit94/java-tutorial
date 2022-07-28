package temperatureConverterInterfaceExample.converters;

import temperatureConverterInterfaceExample.temperatureUnits.Celsius;
import temperatureConverterInterfaceExample.temperatureUnits.Fahrenheit;
import temperatureConverterInterfaceExample.temperatureUnits.Kelvin;

public interface CanConvertToKelvin extends TemperatureConverterConstants, CanConvertToCelsius{
    default Kelvin convertToKelvin(Celsius celsius){
        float degree=celsius.getDegree()+KELVIN_CELSIUS_CONSTANT;
        return new Kelvin(degree);
    }
    default Kelvin convertToKelvin(Fahrenheit fahrenheit){
        Celsius celsius = convertToCelsius(fahrenheit);
        Kelvin kelvin=convertToKelvin(convertToCelsius(fahrenheit));
        return kelvin;
    }
}
