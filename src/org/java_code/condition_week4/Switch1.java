package org.java_code.condition_week4;

public class Switch1 {

	public static void main(String[] args) {
		int value = 1;
		
		switch(value) {
		case 1: 
			System.out.println("1");
			break;					// break가 없다면, case에 걸리는 부분 이후 모든 값이 출력
		case 2: 
			System.out.println("2");
			break;
		case 3: 
			System.out.println("3");
			break;
		default: 
			System.out.println("그 외의 ");

		}
	}

}
