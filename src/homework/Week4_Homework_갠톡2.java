package homework;

import java.util.Scanner;

public class Week4_Homework_갠톡2 {
//	#2.
//	윤년의 계산법은 다소 복잡하다. 4로 나누어 떨어지는 해는 윤년 이지만 100으로 나누어 떨어지는 해는 윤년이 아니며, 400으로
//	나누어 떨어지는 해는 다시 윤년이다. 연도를 저장하는 변수에 할당된 값에 따라 윤년인지 아닌지를 출력하시오.(자신의 코드가 잘 동작하는지를 테스트해야 함)

	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
//		[교수님 풀이]
//		a = 4로 나뉘어 지는 수
//		b = 100으로 나뉘어지는 수
//		c = 400으로 나뉘어지는 수
//		중에서 a-b+c 가 윤년. = (y%4==0) && (y%100!=0) || (y%400==0)
		
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요 : ");		
		year = sc.nextInt();
		
		if (year%4 == 0 && year!=0 || year%400==0) {
			System.out.println("윤년입니다.");
		}

		else {
			System.out.println("윤년이 아닙니다.");
		}
	}
}

