package Middle_Ex_Gichul;
import java.util.Scanner;

public class no10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int a = sc.nextInt();
		int w = 0;
		String josa;

		if (a%10==1||a%10==3||a%10==6||a%10==7||a%10==8||a%10==0) {
			josa = "은";
		} else josa = "는";

		boolean PC = false; // 소수를 판별하는 부분
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				PC = true;
				break;
			}
		}
		if (PC == false) {
			System.out.println(a + josa + " 소수입니다.");
			} 
		else {
			for (int m = 2; m <= a; m++) {
				if (a % m == 0) {
					w = m;
					break;
				} 
					else
					continue;
			}
			System.out.println(a + josa + " " + w + "의 배수입니다.");
		}
	}
}
