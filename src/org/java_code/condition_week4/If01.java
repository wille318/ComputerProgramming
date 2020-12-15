package org.java_code.condition_week4;

public class If01 {

	public static void main(String[] args) {
//		난수 하나를 생성하여 0.5 이상이면 “0.5 이상”을 출력하는 조건문을 작성하시오.
		
		double n = Math.random();
		
		if(n>=0.5) { //괄호 안에 한문장밖에 없다면 생략 가
			System.out.println("0.5이상"); 
		}
//		Q. 난수 하나를 생성하여 0.5 이상이면 “0.5 이상”을 출력하고 0.5 미만이면 “0.5 미만”을 출력하
		if(n<0.5) {
			System.out.println("0.5미만");
		}	
//		else{
//			System.out.println("0.5미만");
//		}
	}
}
