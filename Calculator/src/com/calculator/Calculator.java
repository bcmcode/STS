package com.calculator;

public class Calculator implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double operandOne;
	private double operandTwo;
	private String operation;
	private double result;
	
	public Calculator() {}
	
	public void performOperation() {
		if(this.operation == "+") {
			result = this.getOperandOne() + this.getOperandTwo();
		}
		if(this.operation == "-") {
			result = this.getOperandOne() - this.getOperandTwo();
		}
	}
	
	public double getResult() {
		return this.result;
	}
	
	public double getOperandOne() {
		return operandOne;
	}
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	public double getOperandTwo() {
		return operandTwo;
	}
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
}
