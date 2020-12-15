package homework;
import java.util.Scanner;

public class Week6_Homework_단톡1 {

	public static void main(String[] args) {
//		정수를 입력받으면 이 수를 거꾸로 출력해보시오.
//		맨 앞자리에 0이 오는 경우 이를 생략
		
//		입력: 3957
//		출력: 7593
//		입력: 83500
//		출력: 538
		
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
		Scanner scn = new Scanner(System.in); 
		System.out.print("입력 : "); 
		String num = scn.next(); //split 함수로 각각의 자리수를 배열에 넣어 주기 위해 int가 아닌 String에 넣음 
		
		String[] array_num = num.split(""); //각각의 자리수별로 배열에 넣어줌 
		int i;
			
		int len = array_num.length; 
		for (i=len-1; i>=0; i--) {  //배열으 역(반대)으로 출력
			System.out.print(array_num[i]);
		}
	}
}
