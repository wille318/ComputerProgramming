package a_finaltest_note;
import java.util.Scanner;

public class no8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean fin = true;
		
		for (int i=1; i<=a; ++i) {
			if (a%i ==0) System.out.println(i+" ");
		}
	}

}
