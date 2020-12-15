package org.java_code.loop_week5;
import java.util.Scanner;

public class While3_2 {

	public static void main(String[] args) {
		
//		숫자를 입력받아서 이전에 입력한 수보다 큰 수가 입력되면 다 시 입력받고 이전에 입력한 수보다 같거나 작은 수가 입력되면 종료하시오.
//		맨 처음 입력할 때는 이전에 0이 입력되어 있다고 가정하고 풀 것
//		
//		숫자를 입력하시오. 5 
//		숫자를 입력하시오. 10 
//		숫자를 입력하시오. 13 
//		숫자를 입력하시오. 7 
//		종료
		
		Scanner scn = new Scanner (System.in);
		
		int current = 0 ; 
		
		System.out.println("숫자를 입력하세요. : ");
		int next = scn.nextInt();
		

		while (current<next) {
			System.out.println("숫자를 입력하세요. : ");
			current = next; //이전값을 버리고, 현재값을 이전값으로 넘겨
			next = scn.nextInt();
		}
		
		System.out.print("종료");
	}

}
