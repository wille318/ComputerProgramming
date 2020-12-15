package homework;
import java.util.Scanner;

public class Week6_Homework_단톡2 {

	public static void main(String[] args) {
//		네 명 학생의 이름과 국, 영, 수 점수를 입력받아 저장하고 총점,평균과 함께 출력하시오.
//		이름과 점수는 각각 별도의 배열에 저장한다.
		
		System.out.println("60190295 김예빈 ");
		System.out.println("-------------- ");

		  String[] name = new String[4];
		  int[] kor = new int[4];
		  int[] eng = new int[4];
		  int[] math = new int[4];
		
		  int[] total = new int[4];
		  double[] avg = new double[4]; //평균은 소수점으로 나올 수 있으므로 double
		  
		  Scanner sc = new Scanner(System.in);
		  
		  for(int i=0; i<4; i++){
			  System.out.println("이름과 점수를 입력하세요. \n이름: ");	 
			  name[i] = sc.next();
			  System.out.print("국어 : "); kor[i] = sc.nextInt();
			  System.out.print("영어 : "); eng[i] = sc.nextInt();
			  System.out.print("수학 : "); math[i] = sc.nextInt();
			   
			  total[i] = kor[i] + eng[i] + math[i];
			  avg[i] = total[i] / 3; 
		  }
			  
		  System.out.println("\tKor\tEng\tMath\tTot\tAvg");
		  System.out.println("============================================");

		  for(int i=0; i<4; i++){
			   System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f", 
					   name[i], kor[i], eng[i], math[i], total[i], avg[i]);
			   System.out.println(); 
		  }
	}
}
