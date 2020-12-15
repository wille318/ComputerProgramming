package org.java_code.loop_week5;
import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
//		1부터 10까지의 합을 구해보시오. 
//		아래와 같이 출력할 것(while / for)
//		1,2,3,4,5,6,7,8,9,10,55
		
		Scanner scn = new Scanner (System.in);
		System.out.println("숫자를 입력하세요. : ");
		int n = scn.nextInt();
		
		int sum =0 ;
		
		for(int i=1; i<=10; ++i) {
			System.out.print(i);
			if (i<=n) System.out.print(" + ");
			else System.out.print(" = ");
			sum = sum + i;
		}
		System.out.print(sum);
	}
}
