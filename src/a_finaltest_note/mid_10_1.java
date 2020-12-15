package a_finaltest_note;

public class mid_10_1 {
	
//	 10-1번 문제
//	 아래와 같이 출력하시오. [각 10점, 이중 for문을 반드시 쓸 것]
//		1 * * * 1 
//		* 2 * 2 * 
//		* * 3 * * 
//		* 4 * 4 * 
//		5 * * * 5
	
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if (i==j || i+j==4) System.out.print(" " + (i+1) + " ");
				else System.out.print(" * ");
			}
			System.out.println("");
		}
		
		System.out.println("===============================");

//	10-2번 문제
//	아래와 같이 출력하시오. [각 10점, 이중 for문을 반드시 쓸 것]	
//	 1 –1  1 –1  1 
//	-1  1 –1  1 –1 
//	 1 –1  1 –1  1 
//	-1  1 –1  1 –1 
//	 1 –1  1 –1  1
		  
		for(int m=0; m<5; m++) {
			for(int n=0; n<5; n++) {
				if ((m+n)%2==0) System.out.print(" 1 ");
				else System.out.print("-1");
			}
			System.out.println("");
		}
		
	}

}
