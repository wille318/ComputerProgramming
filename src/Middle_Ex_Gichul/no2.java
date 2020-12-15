package Middle_Ex_Gichul;
import java.util.Scanner ;

public class no2 {
	
	public static void main(String[] args){
		System.out.println("60190295 김예빈");
		System.out.println("------------------");
		
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int count = 1;
		
		int [] arr = new int [count];
				
		for(int i = 1; i<=a; i++) {
			if (a%i == 0) {
				int c = arr.length - 1;
				arr[c] = i ;
				count += 1 ; 
			}
		}
		System.out.println(a + "의 약수 개수는 " +(count-1) + "개입니다. ");
	}

}
