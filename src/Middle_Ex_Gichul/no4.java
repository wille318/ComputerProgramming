package Middle_Ex_Gichul;
import java.util.Scanner ; 

public class no4 {

	public static void main(String[] args) {
		System.out.println("60190295 김예빈");
		System.out.println("------------------");
		
		Scanner scn = new Scanner(System.in);

		int a = 1;
		int b = 1;
		int x = scn.nextInt();

		int []array = new int [x];
		array[0] = 1;
		array[1] = 1;
		System.out.print(array[0]+ " ");
		System.out.print(array[1]+ " ");

		for (int i = 2; i<x; i++) {
			int c = a+b;
			array[i] = c;
			a = b;
			b = c;
			System.out.print(array[i]+ " ");
		}
	}

}
