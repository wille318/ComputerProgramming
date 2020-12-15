package org.java_code.condition_week4;
import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
//		숫자 세 개를 입력받고 그 중 가장 큰 수를 출력하시오.
		int a,b,c;
		
		Scanner scn = new Scanner(System.in);
		a = scn.nextInt();
		b = scn.nextInt();
		c = scn.nextInt();
		
		if(a>b && a>c) {
			System.out.println("가장 큰 수는 " +a);
		}
		else if (b>c) {
			System.out.println("가장 큰 수는 " +b);
		}
		else{
			System.out.println("가장 큰 수는 " +c);
		}
		
//		코드 간결하게 쓰는 법
//		int a,b,c ; 
//		int max;
//		
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		
//		if(a>b && a>c)max = a;
//		else if (b>c)max = b;
//		else max = c;
//		System.out.println("가장 큰 수는 " +max);

	}

}
