package a_finaltest_note;
import java.util.Scanner;

public class mid_9 {

//	9번 문제 
//	8개 학기 성적을 입력하면 학부 전체 평점을 출력해주는 프로그램을 작성하시오. 
//	(입력은 Scanner를 쓸 것. 반드시 2차원 배열을 쓸 것)
	
	public static void main(String[] args) {
//	1. 리스트 8개 방 만들기 
	double array [][] = new double [4][2];
	
	Scanner sc = new Scanner(System.in);
	double sum = 0;
	
// 2. 방에 학기별 학점 넣기 (+ 학기별 평점 더해가기)
	for (int i=0; i<4; i++) {
		for (int j=0; j<2; j++) {
			System.out.println((i+1)+"학년 "+ (j+1) +"학기 성적을 입력해주세요. : ");
			array[i][j] = sc.nextDouble();
			sum = sum+array[i][j];
		}
	}
	
// 3. 학기별 평점 출력하기 
	System.out.println("학부 전체 평점은 : " + sum/8 + " 입니다.");	
	}

}
