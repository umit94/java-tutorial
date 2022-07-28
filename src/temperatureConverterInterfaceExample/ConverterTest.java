package temperatureConverterInterfaceExample;

import temperatureConverterInterfaceExample.temperatureUnits.Celsius;
import temperatureConverterInterfaceExample.temperatureUnits.Fahrenheit;
import temperatureConverterInterfaceExample.temperatureUnits.Kelvin;

public class ConverterTest {
    public static void main(String[] args) {
        Converter converter = new Converter();
        System.out.println("40 K = "+converter.convertToCelsius(new Kelvin(40)).getDegree()+" C");
        System.out.println("40 F = "+converter.convertToCelsius(new Fahrenheit(40)).getDegree()+" C");
        System.out.println("40 C = "+converter.convertToFahrenheit(new Celsius(40)).getDegree()+" F");
        System.out.println("40 F = "+converter.convertToKelvin(new Fahrenheit(40)).getDegree()+" K");

        Kelvin kelvin=new Kelvin(100);
        Celsius celsius = converter.convertToCelsius(kelvin);
        System.out.println(kelvin.getDegree()+kelvin.getTemperatureUnit()+" = "+celsius.getDegree()+celsius.getTemperatureUnit());
    }
}
