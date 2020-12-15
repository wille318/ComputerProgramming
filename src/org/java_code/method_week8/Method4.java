package org.java_code.method_week8;
import java.util.Scanner;

public class Method4 {
	public static int add (int a, int b) {
		return a+b;
	}
	
	public static int sub (int a, int b) {
		return a-b;
	}
	
	public static int mul (int a, int b) {
		return a*b;
	}
	
	public static double div (int a, int b) {
		return (double)a/(double)b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("두 수의 합은 "+add(a,b));
		System.out.println("두 수의 차은 "+sub(a,b));
		System.out.println("두 수의 곱은 "+mul(a,b));
		System.out.println("두 수의 나눗셈은 "+div(a,b));

	}

}
