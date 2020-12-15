package org.java_code_temp;

public class Trycatch {

	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눴습니다.");
			
		}
	}

}
