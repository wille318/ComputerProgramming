package org.java_code.loop_week5;

public class While3 {

	public static void main(String[] args) {
//		1부터 10까지의 합을 구해보시오. 
//		아래와 같이 출력할 것(while / for)
//		1,2,3,4,5,6,7,8,9,10,55
		
		int i=1;
		int sum=0 ;
		
		while (i<=10) {
			System.out.println(i);
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
	}

}
