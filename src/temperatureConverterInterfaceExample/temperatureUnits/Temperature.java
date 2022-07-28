package temperatureConverterInterfaceExample.temperatureUnits;

public abstract class Temperature {
    float degree;

    protected Temperature(float degree){
        this.degree=degree;
    }

    public final float getDegree() {
        return degree;
    }

    public abstract String getTemperatureUnit();
}
