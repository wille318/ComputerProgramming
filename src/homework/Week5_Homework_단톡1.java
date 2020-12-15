package homework;
import java.util.Scanner;

public class Week5_Homework_단톡1 {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
//		정수 하나를 입력받아서 소수인지 아닌지 판별해보시오. 단, “은”과 “는”이 구별되어 출력되어야 함
//		실행결과) 12 12는 소수가 아닙니다.
//		실행결과) 13 13은 소수입니다.
		
//		"은"을 쓰는 값인 경우 if, "는"은 else : 뒷자리 수의 받침에 따라 달라짐 
//		1의 자리 구하기 -> (숫자%10) 즉, 10으로 나눴을 떄 나머지
//		은 = 1,3,6,7,8,0
//		는 = 2,4,5,9
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a ;
		a = sc.nextInt();
		
		boolean PC = false; //소수를 판별하는 부분 
		for(int i=2; i<a; i++) {
			if(a%i==0) {           
				PC = true;  break;
			} //판별하는 수보다 작은 정수로 나누어나가며 나머지가 0(나누어 떨어지)이면 소수가 아님(true값으로 판별)
		}     // 소수 = 약수를 자신과 1만 갖는 수이기 때문에 
		
		if(PC == false) {
			if(a%10==1 || a%10==3 || a%10==6 || a%10==7 || a%10==8 || a%10==0) {
				System.out.println( a + "은 소수입니다.");
			}
			else System.out.println(a + "는 소수입니다.");
		}
		else {
			if(a%10==1 || a%10==3 || a%10==6 || a%10==7 || a%10==8 || a%10==0) {
				System.out.println( a + "은 소수가 아닙니다.");
			}
			else System.out.println(a + "는 소수가 아닙니다.");
		}	
	}
}
