package com.quantitymeasurement;

public class QuantityMeasurement {
	public boolean compareUnits(double feet, double inch) {
		if (inch == 12 * feet)
			return true;
		return false;
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Quantity Measurement");

	}
}
