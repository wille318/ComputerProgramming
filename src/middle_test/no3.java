package middle_test;
import java.util.Scanner;

public class no3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int big = 0;
		
		System.out.println("숫자를 입력하세요 : ");
		
		for(int i=0; i<100;++i) {
			int n= sc.nextInt();
			if (n<0) {
				break;
			} else {
				if (a<n) {
					a=big;
					big = n;
					
				}
			}
		}			
		System.out.println(big);

	}

}
