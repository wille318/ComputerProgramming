package middle_test;
import java.util.Scanner ; 

public class no2 {

	public static void main(String[] args) {
//11번 
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		
		boolean PC = false; // 소수를 판별하는 부분

		for (int i =2; i<=a; i++) {
			if (a % i == 0) {
				PC = false;
				continue;
			}
			
		}

		
	}

}
