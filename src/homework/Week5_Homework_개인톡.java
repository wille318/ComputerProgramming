package homework;
import java.util.Scanner;

public class Week5_Homework_개인톡 {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");
		
//		두 수를 입력받아서 공약수를 모두 출력해보시오.
//		두 수를 입력하시오: 30 20 공약수: 1 2 5 10
//		30과 20의 공약수는 4개입니다.
		
		Scanner scn = new Scanner(System.in); 
		int a, b, n;
		int count = 0;
		
		System.out.print("두 수 입력하시오. : "); 
		a = scn.nextInt(); 
		b = scn.nextInt(); 
		
		System.out.print("공약수 : ");
		for(n=1; n<=a; n++) {
			if ((a%n==0) && (b%n==0)) {
				count++;
				System.out.print(n + " ");
			}
		}
		System.out.println("\n" + a+"와 " + b + "의 공약수는 " + count + "개 입니다.");
	}

}
