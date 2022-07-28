package temperatureConverterInterfaceExample.converters;

import temperatureConverterInterfaceExample.temperatureUnits.Celsius;
import temperatureConverterInterfaceExample.temperatureUnits.Fahrenheit;
import temperatureConverterInterfaceExample.temperatureUnits.Kelvin;

public interface CanConvertToCelsius extends TemperatureConverterConstants {

    default Celsius convertToCelsius(Kelvin kelvin){
        float degree=kelvin.getDegree()-KELVIN_CELSIUS_CONSTANT;
        return new Celsius(degree);
    }

    default Celsius convertToCelsius(Fahrenheit fahrenheit){
        float degree=(fahrenheit.getDegree()-FAHRENHEIT_CELSIUS_SUBTRACT_CONSTANT)*FAHRENHEIT_CELSIUS_MULTIPLY_CONSTANT;
        return new Celsius(degree);
    }
}
