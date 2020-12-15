package org.java_code.operator_week4;

public class operator2 {

	public static void main(String[] args) {
//		Q1. 임의의 난수 두 개를 생성하여 첫 번째 수가 두 번째 수보다 큰 지에 대해 참/거짓을 출력하시오. (크면 참, 작으면 거짓)
//		Math.random() 함수를 사용하시오.

		double a, b;
		a = Math.random();
		b = Math.random();
		System.out.println("첫번째수 : "+a);
//		
//		a = Math.round(a); //반올림 함
//		System.out.println("첫번째수(반올림) : "+a);

//		소숫점 둘째자리에서 반올림하기 (셋째자리면 100, 넷째자리면 1000)
		a = (double)(Math.round(a*10)/10); 
		System.out.println("첫번째수(소숫점 첫째자리 반올림) : "+a);
//		
//		System.out.println("두번째수 : "+b);
//		
//		System.out.println("첫번째 수가 두번째 수보다 큰 것은 : "+(a>b));


	}

}
