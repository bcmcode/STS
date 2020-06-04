package com.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calvin = new Calculator();
		calvin.setOperandOne(10.5);
		calvin.setOperandTwo(5.2);
		calvin.setOperation("-");
		calvin.performOperation();
		System.out.println(calvin.getResult());
		CalculatorTwo cal = new CalculatorTwo();
		cal.performOperation(10);
		cal.performOperation("+");
		cal.performOperation(5);
		cal.performOperation("*");
		cal.performOperation(10);
		cal.performOperation("/");
		cal.performOperation(4);
		cal.performOperation("-");
		cal.performOperation(2.5);
		cal.performOperation("*");
		cal.performOperation(5);
		cal.performOperation("=");
		System.out.println(cal.getResults());
	}

}
