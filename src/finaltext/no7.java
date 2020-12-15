package finaltext;
import java.util.Scanner;

public class no7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int array [] = new int [5];
		System.out.println("숫자 5개 : ");
		for (int i=0;i<5;i++) {
			array[i]=sc.nextInt();
		}
		
		for (int i=0;i<5;i++) {
		System.out.print(array[i]+" ");
		}
		System.out.println();

		
		System.out.println("숫자를 입력하세요 : ");
		int a =  sc.nextInt(); //받는 수
		for(int j=0;j<=5;j++) {
			if(array[j]== a) {
				System.out.println((j+1)+"번째");
				return;
			}
		}
		System.out.println("존재하지 않습니다.");
	}

}
