package a_finaltest_note;
import java.util.Scanner;
//import java.util.Arrays;
public class mid_8 {

//	8번 문제. 
//	0을 입력할 때까지 숫자를 입력받는다. (최대 10개) 
//	그리고나서 숫자를 하나입력받아서 해당 숫자가 기존 입력받은 수 중 포함여부를 출력하는 프로그램을 작성하시오. 
//	(ex. 3 16 9 5 0 입력후 3을 입력하면 “포함되어 있습니다.”, 7을 입력하면 “포함되어 있지 않습니다.”를 출력)
	
	public static void main(String[] args) {
//		1. 0입력할 때까지 숫자 입력 받기위한 세팅. 최대 10 == array 리스트 쓰는거
	
		Scanner sc = new Scanner(System.in);
		int array [] = new int [10];
		int i=0;
		
		System.out.println("숫자를 입력해 주세요. : ");
		int next = sc.nextInt();

//	2. 숫자 입력받아 차곡차곡 array에 넣기
		while (next!=0) { //0이 들어오면 while 문은 멈춤. 
			array[i]=next;
			i++;
			next = sc.nextInt();
		}
		
//		System.out.println(Arrays.toString(array));

//	3. 숫자 입력받고, array와 대조
			
//		방법1. return 쓰기 
		System.out.println("숫자 하나를 입력해주세요. : ");
		int input = sc.nextInt();
		
		for(int j=0;j<=i;j++) {
//			System.out.println(array[j]);

			if(array[j]== input) {
				System.out.println("숫자가 포함되어있습니다.");
				return;
			}
		}
		System.out.println("숫자가 포함되지 않았습니다.");

//	방법2. 새로운 변수 사용int input = s.nextInt()
//		boolean is_included = false;
//
//		for(int j = 0;j<i;j++){
//		   if(array[j] == input) {
//		      is_included = true;
//		      break;
//		   }
//		}
//
//		if(is_included) System.out.println("숫자 포함");
//		else System.out.println("숫자 미포함");
	}

}
