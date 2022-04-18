/* @Purpose: As a math student, I wish to compare lengths 1ft = 12in 
 * @File: Quantity Measurement 
 * @Author: Akshay Kumar
 */

package com.quantitymeasurement;

/*
 * @Purpose: Compare units 1feet = 12inch logic 
 * @Param: double Feet , double Inch
 * @Result: Boolean (true,false) & Welcome Message
 */
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
