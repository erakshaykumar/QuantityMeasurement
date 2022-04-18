package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
	private QuantityMeasurement quantitymeasurement;

	@Before
	public void init() {
		quantitymeasurement = new QuantityMeasurement();
	}

	@Test
	public void givenFeetAndInchesValue_WhenEqual_ShouldReturnTrue() {
		double feet = 1;
		double inch = 12;
		boolean result = quantitymeasurement.compareUnits(feet, inch);
		Assert.assertTrue(result);
	}
}