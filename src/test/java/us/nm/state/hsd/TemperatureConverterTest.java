package us.nm.state.hsd;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    	@Test
    	void celsiusToFahrenheit() {
    	    assertEquals(212, TemperatureConverter.celsiusToFahrenheit(100));
    	}
}
