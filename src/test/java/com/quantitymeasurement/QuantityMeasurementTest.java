package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
	QuantityMeasurement quantitymeasurement = new QuantityMeasurement();

	@Test
	public void givenFeetAndInchesValue_WhenEqual_ShouldReturnTrue() {
		double feet = 1;
		double inch = 12;
		boolean result = quantitymeasurement.compareUnits(feet, inch);
		Assert.assertTrue(result);
	}
}