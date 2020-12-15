package org.java_code.loop_week5;

public class For5 {

	public static void main(String[] args) {
//		1부터 10까지의 수를 인쇄하다가 3의 배수가 되면 건너 뛰시오. 
//		for문과 continue를 사용할 것
		for(int i=1; i<=10;++i) {
			if(i==3 || i==6 || i==9)continue;
//			if(i%3==0) continue;
			System.out.println(i);
			
		}
		
	}

}
