/* @Purpose: As a math student, I wish to compare lengths 1ft = 12in 
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */

package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

/*
 * @Purpose: Compare 1feet = 12inch 
 * @Param: Feet , Inch
 * @Result: Boolean result
 */
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