package middle_test;
import java.util.Scanner ; 

public class no10 {
// 12번 
	public static void main(String[] args) {
//		컴퓨터 생성 랜덤 부분 
		int a = (int)(Math.random()*3+1);
		String b = null ;

		switch (a)  {
			case 1 : b = "가위"; break;
			case 2 : b = "바위"; break;
			case 3 : b = "보"; break;
		}

//		입력 부분 
		Scanner scn = new Scanner(System.in);
		 System.out.println("가위, 바위, 보 중 하나를 입력하시오: ");
		String c = scn.next();
		int d = 0 ; 
		
		switch (c) {
			case "가위" : d = 1; break;
			case "바위" : d = 2; break;
			case "보" : d = 3; break;
		}

//		승패 판별 부분 
		if (b.equals(c)) System.out.println("무승부");
		else if (a > d) { 
			if (a==3 && d==1) System.out.println("승");
			else System.out.println("패");
		}
		else if (a < d) { 
			if (a==1 && d==3) System.out.println("패");
			else System.out.println("승 ");
		}
	}

}
