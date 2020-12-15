package a_finaltest_note;
import java.util.Scanner;

public class mid_11 {

//	11번 문제 
//	정수를 입력받아서 2부터 그 수 사이의 소수가 아닌 수를 모두 출력하시오. 
//	(ex. 10입력시 4 6 8 9를 출력)
	
	public static void main(String[] args) {

//	1. 정수 입력받기 
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력해주세요 : ");
		int num = sc.nextInt();
						
//	2. 2부터 그 수 사이에 소수 구하기
		boolean tf = true; //true 소수인경우 
		
		for(int i=2; i<num; ++i) {
			for(int j=2;j<i; ++j) {
				if(i%j==0 && i!=2) tf =false;
			}
			if(tf==false) System.out.print(i+" "); //false 소수가아닌경우 
			tf = true;
		}
	}
}

//약수 출력하기
//	Scanner sc = new Scanner(System.in);
//	int a = sc.nextInt();

//	for (int i=1; i<=a; ++i) {
//		if (a%i ==0) System.out.println(i+" ");
//	}

//약수가 아닌 수를 출력하려면 (a%i != 0)
//	for (int i=1; i<=a; ++i) {
//		if (a%i !=0) System.out.println(i+" ");
//	}