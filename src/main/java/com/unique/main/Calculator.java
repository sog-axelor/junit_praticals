package com.unique.main;

public class Calculator {
	  public int evaluate(String expression) {
	    int sum = 0;
	    for (String summand: expression.split("\\+"))
	      sum += Integer.valueOf(summand);
	    System.out.println("The sum is : " + sum);
	    return sum;
	  }
	  public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.evaluate("1+2+3");
	}
	}