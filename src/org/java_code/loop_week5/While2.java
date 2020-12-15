package org.java_code.loop_week5;

public class While2 {

	public static void main(String[] args) {
//		아래와 같이 20미만의 홀수를 출력하는 코드를 작성해보시오. 
//		while과 for를 사용하여 각각 작성할 것
//		1,3,5,7,9,11,13,15,17,19
		int i=0;
		while(i<20) {
			i++;
			if(i%2==1) //홀수인 경우만 프린
				System.out.println(i);
		}
//		[방법2]
//		while(i<20) {
//			System.out.println(i);
//			i=i+2;
//		}
	}
}
