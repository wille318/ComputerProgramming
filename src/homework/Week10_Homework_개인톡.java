package homework;
import java.util.Arrays;
import java.util.Scanner;

public class Week10_Homework_개인톡 {
//	미니 로또 프로그램을 작성하시오.
//	• 사용자는 1부터 30사이의 숫자 4개를 크기 순으로 입력한다.
//	• 숫자 다섯개를 랜덤으로 생성하되 중복은 허용하지 않으며 크기 순으로 나열하여 보여준다.
//	• 그 중 맞춘 개수에 따라서 4개를 다 맞추면 1등, 3개는 2등, 2개는 3등, 1개를 맞출 경우 4등을 출력하고 
//	  맞춘 숫자가 없는 경우 꽝을 출력한다.
	
//	• 예시
//	> 1부터 30 사이의 숫자 4개를 입력하시오.
//	  2 8 11 25
//	  당첨 번호는 4 9 11 25 축하합니다. 
//	  3등입니다.
	
	Scanner sc = new Scanner(System.in);
	int my_num[] = new int [4];
	int lotto_num[] = new int [4];
	int count;
	
	void inputnumber() {
		System.out.print("1부터 30사이의 숫자 4개를 입력하세요 :");
		for(int i=0;i<this.my_num.length; i++) {
			my_num[i]=sc.nextInt();
		}
	}
	void lottonumber() {
		for(int i=0; i<this.lotto_num.length;i++) {
			lotto_num[i] = (int)(Math.random()*30)+1;
			for(int j=0; j<i;j++) {
				if(lotto_num[i]==lotto_num[j]) {
					i--;
				}
			}
		}
		for(int i=0; i<this.lotto_num.length;i++){
			for(int j=i+1;j<this.lotto_num.length;j++) {
				if(lotto_num[i]> lotto_num[j]) {
					int temp = lotto_num[j];
					lotto_num[i] = lotto_num[j];
					lotto_num[j] = temp;
				}
			}
		}
		System.out.println("당첨번호는 "+ lotto_num[0]+" "+ lotto_num[1]+" "+ lotto_num[2]+" "+ lotto_num[3]);
	}
	void winning() {
		for(int i=0; i<my_num.length;i++) {
			for(int j=0; j<lotto_num.length;j++) {
				if(lotto_num[i]==lotto_num[j]) {
					count++;
				}
			}
		}
		if(count ==4) System.out.println("1등");
		else if(count ==3) System.out.println("2등");
		else if(count ==2) System.out.println("3등");
		else if(count ==1) System.out.println("4등");
		else if(count ==0) System.out.println("꽝");
	}
	public static void main(String[] args) {
		Lotto l= new Lotto();
		l.inputnumber();
		l.lottonumber();
		l.winning();
	}
}
	
	
//	
//	public static void main(String[] args) {
//		System.out.println("60190295 김예빈 ");
//		System.out.println("-------------- ");
//		Scanner scn = new Scanner(System.in); 
////		1. 숫자 입력받기		
//		int[] numbers = new int[4];
//		System.out.println("1에서 30사이의 숫자를 입력해주세요. : ");
//
//		for(int k=0; k<4; k++) {
//			numbers[k] = scn.nextInt();
//
//			if (numbers[k]>30 || numbers[k]<1) {
//				k--;
//				System.out.println("1에서 30사이의 숫자를 입력해주세요. ");
//			}
//			else {
//				for(int j = 0; j<k; j++) { //중복값제거부분 
//					if(numbers[k]==numbers[j]) {
//						k--; 
//						System.out.println("중복값을 입력하셨습니다. ");
//					}
//				}
//			}
//		}
//		System.out.print("입력하신 숫자는 ");
//		for (int i=0; i<4; i++) {
//			System.out.print(numbers[i]+" ");
//		}
//		System.out.print("입니다. ");
//
////		2. 랜덤으로 1~30사이의 숫자 5개 뽑기  
//		int[] ltt = new int[4];
//
//		for (int i = 0; i < 4; i++) {
//			ltt[i] = (int)(Math.random()*30)+1;
//			for(int j = 0; j<i; j++) { //중복값제거부분 
//				if(ltt[i]==ltt[j]) {
//					i--; break;
//				} 
//			}
//		}
//		System.out.println("\n");
//		System.out.println("당첨번호는 " + Arrays.toString(ltt) + "입니다.");
////		3. 입력받은 숫자와 랜덤숫자 비교하기
//		int sum = 0;
//		for (int i=0; i<4; i++) {
//			for (int j=0; j<4; j++) {
//				//만일 입력값과 랜덤값이 작은 순서대로 되어있다면 for(int j=0; 랜덤값[i]>입력값[j];++j로 시행횟수를 줄일 수 있음. 
//				if(numbers[i]==ltt[j]) {  
//					sum++;
//				}
//			}
//		}
////		4. 맞춘 개수에 따라 등수 프린트하기 
//		String w;
//		if(sum==4) { w = "1등"; }
//		else if(sum==3) { w = "2등"; }
//		else if(sum==2) { w = "3등"; }
//		else if(sum==1) { w = "4등"; }
//		else w = "꽝";
//		System.out.println("축하합니다. " + w +" 입니다.");
//	}
//}
