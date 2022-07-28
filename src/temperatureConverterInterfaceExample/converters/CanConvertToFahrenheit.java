package temperatureConverterInterfaceExample.converters;

import temperatureConverterInterfaceExample.temperatureUnits.Celsius;
import temperatureConverterInterfaceExample.temperatureUnits.Fahrenheit;
import temperatureConverterInterfaceExample.temperatureUnits.Kelvin;

public interface CanConvertToFahrenheit extends TemperatureConverterConstants{
    default Fahrenheit convertToFahrenheit(Celsius celsius){
        float degree= (celsius.getDegree()/FAHRENHEIT_CELSIUS_MULTIPLY_CONSTANT)+FAHRENHEIT_CELSIUS_SUBTRACT_CONSTANT;
        return new Fahrenheit(degree);
    }

    default Fahrenheit convertToFahrenheit(Kelvin kelvin){
        float degree=((kelvin.getDegree()-KELVIN_CELSIUS_CONSTANT)/FAHRENHEIT_CELSIUS_MULTIPLY_CONSTANT)+FAHRENHEIT_CELSIUS_SUBTRACT_CONSTANT;
        return new Fahrenheit(degree);
    }
}
