/**
 * 
 */
package lab02;

/**
 * Represents a temperature.
 */
public interface Temperature extends Comparable<Temperature> {
  /**
   * Absolute zero, in degrees Celsius. For our purposes, no temperature can be below
   * this value.
   */
  double ABS_ZERO_C = -273.15f;

  /**
   * Absolute Zero, in degrees Fahrenheit. For our purposes, no temperature can be below
   * this value.
   */
  double ABS_ZERO_F = -459.67;

  /**
   * The temperature in degrees Celsius.
   *
   * @return the temperature in degrees Celsius
   */
  double inCelsius();

  /**
   * The temperature in degrees Fahrenheit.
   *
   * @return the temperature in degrees Fahrenheit
   */
  double inFahrenheit();

  /**
   * The temperature in degrees Kelvin.
   *
   * @return the temperature in degrees Kelvin
   */
  double inKelvin();

  /**
   * Average two temperatures and return the resulting temperature.
   *
   * @return the new temperature
   */
  Temperature average(Temperature t);

  /**
   * Get the unit of this object - Celsius or Fahrenheit
   *
   * @return the unit of this temperature
   */
  String getUnit();

  /**
   * Get the temperature of this object
   *
   * @return the temperature of the instance
   */
  double getTemperature();
}