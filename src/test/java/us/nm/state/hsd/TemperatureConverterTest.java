package us.nm.state.hsd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TemperatureConverterTest {

    static final double FAHRENHEIT_TOLERANCE = 0.001;
    static final double KELVIN_TOLERANCE = 0.0005556;

    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void celsiusToFahrenheit(double celsius, double fahrenheit) {
	assertEquals(fahrenheit, TemperatureConverter.celsiusToFahrenheit(celsius), FAHRENHEIT_TOLERANCE);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void celsiusToKelvin(double celsius, double fahrenheit, double kelvin) {
	assertEquals(
		kelvin, 
		TemperatureConverter.celsiusToKelvin(celsius), 
		KELVIN_TOLERANCE);

    }

}
