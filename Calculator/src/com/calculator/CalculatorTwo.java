package com.calculator;

import java.util.ArrayList;

public class CalculatorTwo implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Object> equation;
	private int totalOperations;
	private int totalMulOrDiv;
	
	public CalculatorTwo() {
		this.equation = new ArrayList<Object>();
	}
	
	public void performOperation(double operand) {
		this.equation.add(operand);
	}
	public void performOperation(String operation) {
		this.equation.add(operation);
		this.totalOperations++;
		if(operation == "*" || operation == "/") {
			this.totalMulOrDiv++;
		}
	}
	public double getResults() {
		double result = 0;
		int i = 0;
		int opsDone = 0;
		int mulOrDivDone = 0;
		while(opsDone<this.totalOperations-1) {
			if(mulOrDivDone<this.totalMulOrDiv) {
				if(equation.get(i)== "*") {
					double x = (double) equation.get(i-1);
					double y = (double) equation.get(i+1);
					result = x*y;
					equation.remove(i+1);
					equation.remove(i);
					equation.remove(i-1);
					equation.add(i-1,result);
					i--;
					mulOrDivDone++;
					opsDone++;
				}else if(equation.get(i)== "/") {
					double x = (double) equation.get(i-1);
					double y = (double) equation.get(i+1);
					result = x/y;
					equation.remove(i+1);
					equation.remove(i);
					equation.remove(i-1);
					equation.add(i-1,result);
					i--;
					mulOrDivDone++;
					opsDone++;
				}
				if(mulOrDivDone==this.totalMulOrDiv) {
					i=0;
				}
			}else if(opsDone<this.totalOperations) {
				if(equation.get(i)=="+") {
					double x = (double) equation.get(i-1);
					double y = (double) equation.get(i+1);
					result = x+y;
					equation.remove(i+1);
					equation.remove(i);
					equation.remove(i-1);
					equation.add(i-1,result);
					i--;
					opsDone++;
				}
				else if(equation.get(i)== "-") {
					double x = (double) equation.get(i-1);
					double y = (double) equation.get(i+1);
					result = x-y;
					equation.remove(i+1);
					equation.remove(i);
					equation.remove(i-1);
					equation.add(i-1,result);
					opsDone++;
				}
			}
			i++;
		}
		return result;
	}
	
}
