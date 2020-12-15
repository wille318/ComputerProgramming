package Middle_Ex_Gichul;
import java.util.Scanner;

public class no7 {
	public static void change (int a, int b) {
		int temp = a;
		a = b;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
//		int b = scn.nextInt();

		change(a, b);
		System.out.println(a + " "+b);
	}

}
