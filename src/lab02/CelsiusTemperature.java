package lab02;

/**
 * This class represents a  CelsiusTemperature with a unit and a temperature, it extends
 * the AbstractTemperature Class.
 */
public class CelsiusTemperature extends AbstractTemperature {

    /**
     * Construct a CelsiusTemperature Class with a temperature and unit
     * @param temperature the value that represents this temperature.
     * @throws IllegalArgumentException IF the temperature is lower than ABS_ZERO_C.
     */
    public CelsiusTemperature( double temperature) throws IllegalArgumentException {

        super(AbstractTemperature.CELSIUS, temperature);

        if (temperature < Temperature.ABS_ZERO_C) {
            throw new IllegalArgumentException("Temperature can not be lower than Absolute Zero");
        }

    }



}
