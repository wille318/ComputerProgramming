package org.java_code.object1_week8;

public class Calculator {

	int a, b;
	
	public int sum() {
		return a+b;
	}
	
	public int mul() {
		return a*b;
	}
	public int sub() {
		return a-b;
	}
	
	public double div() {
		return (double)a+(double)b;
	}
	
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.a = 4;
		c.b = 3;
		
		System.out.println(c.sum());
		System.out.println(c.mul());
		System.out.println(c.sub());
		System.out.println(c.div());

	}

}
