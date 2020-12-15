package Middle_Ex_Gichul;
import java.util.Scanner ;

public class no1 {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈");
		System.out.println("------------------");

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();		
		int b = 1 ; 
		
		for (int i =a ; i>= 1; i--) {
			b = b * i;
		}

		System.out.println(a + "!은 " + b + "입니다. " );
	}	

}
