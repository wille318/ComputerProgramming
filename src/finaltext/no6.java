
package finaltext;
import java.util.Scanner;

public class no6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count =0;

		for (int i=1; i<=a; ++i) {
			if (a%i ==0) {System.out.println(i+" ");
			count++;
			}
		}

		System.out.println(count + "개");
	}
}
