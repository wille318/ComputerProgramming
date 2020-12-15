package homework;
import java.util.Scanner;

public class Week4_Homework_갠톡1 {
//	#1.
//	월(month)에 대한 값을 가진 변수가 있다. 2020년 기준으로 이 변수의 값에 따라 마지막 일자를 출력하시오. (예를 들어 9을 입
//	력하면 30, 10을 입력하면 31이 출력되고 1부터 12 외의 수인 경우 "잘못된 값"을 출력)
	
	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
		int a;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);		
		System.out.println("달 입력하세요 : ");		
		a = sc.nextInt();
		
//	31 = 1, 3, 5, 7, 8, 10, 12
//  30 = 4, 6, 9, 11
//  28 = 2
		switch(a) {
		case 1 : 
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println(31);		
			break;
			
		case 2 : 
			System.out.println(28);		
			break;
			
		case 4 :
		case 6 : 
		case 9 :
		case 11 : 
			System.out.println(30);		
			break;

			default: System.out.println("잘못된 값");
		}
	}
}

