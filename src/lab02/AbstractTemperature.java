package lab02;

/**
 * This class Represents an abstraction of temperature with units and temperature value.
 * It implements Temperature's interface.
 */
public abstract class AbstractTemperature implements Temperature{

    protected final String unit;
    protected double temperature;

    public static final String CELSIUS = "Celsius";
    public static final String FAHRENHEIT = "Fahrenheit";


    /**
     * Constructs a Temperature and initialize it to the given unit and temperature value
     * @param unit Type of unit. It can be Celsius Or Fahrenheit
     * @param temperature Represent the temperature value
     */
    public AbstractTemperature(String unit, double temperature) {
        this.unit = unit;
        this.temperature = temperature;
    }

    public String getUnit() {
        return unit;
    }

    public double getTemperature() {
        return temperature;
    }

    public double inCelsius() {

        if(this.isCelsius()){
            return this.temperature;
        }

        return (this.temperature - 32 ) * 5/9;
    }

    public double inFahrenheit() {

        if(this.isCelsius()){
            return (this.temperature * 9/5) +  32;
        }

        return this.temperature;
    }

    public double inKelvin() {

        return (double) this.inCelsius() - Temperature.ABS_ZERO_C;
    }

    public Temperature average (Temperature otherTemperature) {

        Temperature newTemperature;

        if (this.isCelsius()) {
            double averageTemp = (this.inCelsius() + otherTemperature.inCelsius()) / 2;
            newTemperature =  new CelsiusTemperature(averageTemp);
        } else {
            double averageTemp = (this.inFahrenheit()  + otherTemperature.inFahrenheit()) / 2;
            newTemperature = new FahrenheitTemperature(averageTemp);
        }

        return newTemperature;
    }

    @Override
    public String toString() {
        return  String.format("%.1f",this.temperature) + "° " + this.unit;
    }

    @Override
    public int compareTo(Temperature otherTemperature) {

        double comparator = this.inCelsius() - otherTemperature.inCelsius();
        return comparator == 0 ? 0 : comparator > 0 ? 1 : -1;
    }

    /**
     * Verify if the unit type is Celsius
     * @return True if this is a Celsius Unit. Otherwise, false.
     */
    public boolean isCelsius () {
        return this.getUnit() == AbstractTemperature.CELSIUS;
    }


}
