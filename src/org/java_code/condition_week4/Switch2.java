package org.java_code.condition_week4;

public class Switch2 {

	public static void main(String[] args) {
//		객관식 문항에서 보기가 1번부터 5번까지 있으며 정답은 2번이다. 
//		답 을 담고 있는 변수 a의 값에 따라 “정답“ 혹은 “오답"을 출력하시오. *
//		if문으로도 구현해보시오."
				
		int a = 2;
		
		switch(a) {
		case 1: 
		case 3: 
		case 4: 
		case 5:
			System.out.println("오답");
			break;
		case 2:
			System.out.println("정답");
			break;
			default:	
		}
		
//		if문 버전 
		if(a==2)
			System.out.println("정답");
		else if (a==1 || a==3 || a==4 || a==5)
			System.out.println("오답");
			
		
	}

}
