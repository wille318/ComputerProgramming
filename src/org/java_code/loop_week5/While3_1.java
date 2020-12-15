package org.java_code.loop_week5;
import java.util.Scanner;

public class While3_1 {

	public static void main(String[] args) {
//		앞의 예제를 다음과 같이 출력하도록 바꿔보시오.
//		숫자 하나를 입력받아서 입력받은 수까지의 합을 아래와 같이 구해보 시오. (While/For를 사용하여 각각 만들 것)
//		<실행결과>
//		숫자를 입력하시오: 9
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
		
		Scanner scn = new Scanner (System.in);
		int i=1, n;
		int sum=0 ;
		
		System.out.println("숫자를 입력하세요. : ");
		n = scn.nextInt();
		
////		내가 푼 풀이 
//		while (i<=n) {
//			System.out.print(i + " + ");
//			sum = sum + i;
//			i++;
//		}
//		
//		System.out.print("=" + sum);
		
//		교수님이  푼 풀이 
		while (i<=n) {
			System.out.print(i);
			if(i<n) System.out.print(" + ");
			else System.out.print(" = ");
			sum = sum + i;
			i++;
		}
		
		System.out.print(sum);
	}

}
