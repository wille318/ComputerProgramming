package org.java_code.loop_week5;

public class While4 {

	public static void main(String[] args) {
//		변수를 1부터 1씩 증가시키며 출력하다가 5가 되면 종료하시오. 
//		while문과 break를 사용할 것
		
		int i=1;
		while(true) { //()안은 비워
			System.out.println(i);
			if(i==5)break;    //while문은 조건을 하나밖에 달 수 없기 때문에 안에 break를 이용하여 걸어
			++i ; //i=i+1
		}
	}
}
