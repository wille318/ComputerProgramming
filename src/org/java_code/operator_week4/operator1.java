package org.java_code.operator_week4;

public class operator1 {
	

	public static void main(String[] args) {
		System.out.println(1/2);
		System.out.println(1/2.0);
		
		int a=1, b=2;
		double c=2;
		System.out.println(a/b); //정수 나누기 정수 
		System.out.println(a/c); //정수 나누기 실수 
		
//		정수/정수를 실수형으로 결과를 받고 싶다면?
		System.out.println((double)a/b); 

	}

}
