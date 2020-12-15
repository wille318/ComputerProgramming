package homework;
import java.util.Scanner;

public class Week4_Homework_단톡2 {
//	#2
//	문자열 변수를 입력받아서 값이 “Korea”이거나 “korea”인 경우 “대한민국”, “Japan”이거나 “japan”인 경우 “일본”
//	,“Vietnam”이거나 “vietnam”인 경우 “베트남”을 출력하고 그 외인 경우 ＂해당없음＂을 출력하시오.
	
	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나라 입력하세요 :");
		String con = sc.next();
		
		switch(con) {
		case "Korea" :
		case "korea":
			System.out.println("대한민국");
			break ;
			
		case "Japan" :
		case "japan":
			System.out.println("일본");
			break ;
			
		case "Vietnam" :
		case "vietnam":
			System.out.println("베트남");
			break ;
			
			default: System.out.println("해당없음");
		}
	}
}
